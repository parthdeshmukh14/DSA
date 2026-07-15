class Solution {
    public String minWindow(String s, String t) {

        // If t is longer than s, it is impossible to find a valid window
        if (s.length() < t.length()) {
            return "";
        }

        // HashMap to store the frequency of every character in t
        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of characters of t
        // Example:
        // t = "AABC"
        // map = {A=2, B=1, C=1}
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Left pointer of the sliding window
        int left = 0;

        // Number of characters still required to make the window valid
        // Initially we need all characters of t
        int count = t.length();

        // Stores the length of the smallest valid window found so far
        int minLen = Integer.MAX_VALUE;

        // Stores the starting index of that smallest window
        int start = 0;

        // Expand the window by moving the right pointer
        for (int right = 0; right < s.length(); right++) {

            // Current character entering the window
            char ch = s.charAt(right);

            // Only process characters that are actually required
            if (map.containsKey(ch)) {

                // If frequency is greater than 0,
                // this character was still needed
                if (map.get(ch) > 0) {
                    count--;
                }

                // Decrease its required frequency
                // If it becomes negative,
                // it simply means we have extra copies
                map.put(ch, map.get(ch) - 1);
            }

            // If count becomes 0,
            // all required characters are present
            while (count == 0) {

                // Check if current window is the smallest so far
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Character leaving the window
                char leftChar = s.charAt(left);

                // Only update map if this character belongs to t
                if (map.containsKey(leftChar)) {

                    // Restore its frequency because it is leaving
                    map.put(leftChar, map.get(leftChar) + 1);

                    // If frequency becomes positive,
                    // this character is now missing again
                    // Therefore window is no longer valid
                    if (map.get(leftChar) > 0) {
                        count++;
                    }
                }

                // Shrink the window
                left++;
            }
        }

        // If no valid window was found
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        // Return the smallest valid substring
        return s.substring(start, start + minLen);
    }
}