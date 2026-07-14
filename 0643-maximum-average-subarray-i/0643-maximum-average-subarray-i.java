class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int left = 0;
        int right = k - 1;

        int sum = 0;

        // First window sum
        for (int i = left; i < k; i++) {
            sum += nums[i];
        }

        double avg = (double) sum / k;
        double maxavg = avg;

        while (right < nums.length - 1) {

            int incoming = nums[right + 1];
            int outgoing = nums[left];

            // Slide the window
            sum = sum + incoming - outgoing;

            // Calculate new average
            avg = (double) sum / k;

            // Update answer
            maxavg = Math.max(maxavg, avg);

            left++;
            right++;
        }

        return maxavg;
    }
}