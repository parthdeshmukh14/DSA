class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;

        // Answer array to store the number of days
        // int[] ans = new int[n];

        // // Check every day
        // for (int i = 0; i < n - 1; i++) {

        //     int cnt = 0;

        //     // Search for the next warmer day
        //     for (int j = i + 1; j < n; j++) {

        //         cnt++;

        //         // Found a warmer temperature
        //         if (temperatures[j] > temperatures[i]) {
        //             ans[i] = cnt;
        //             break;
        //         }
        //     }
        //     // If no warmer day is found,
        //     // ans[i] remains 0 (default value)
        // }

        // // Last day's answer is always 0
        // ans[n - 1] = 0;

        // return ans;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {

            // Current temperature is warmer than previous unresolved temperatures
            while (!stack.isEmpty() &&
                    temperatures[i] > temperatures[stack.peek()]) {

                // Previous colder day's index
                int prevIndex = stack.pop();

                // Days waited
                ans[prevIndex] = i - prevIndex;
            }

            // Store current day's index
            stack.push(i);
        }

        return ans;
    }
}