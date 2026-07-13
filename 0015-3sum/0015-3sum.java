import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
      
        // HashSet<List<Integer>> set=new HashSet<>();
        // int n=nums.length;
        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         for(int k=j+1;k<n;k++){

        //             if(nums[i]+nums[j]+nums[k] == 0){
        //                 List<Integer>res=new ArrayList<>();
        //                 res.add(nums[i]);
        //                 res.add(nums[j]);
        //                 res.add(nums[k]);
        //                 Collections.sort(res);
        //                 set.add(res);
                        
        //             }
                   
        //         }
        //     }
        // }
        // return new ArrayList<>(set);
        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        int n = nums.length;

        // Step 2: Fix one element
        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            // Step 3: Find the other two numbers using two pointers
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicate values of left
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate values of right
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {

                    // Need a bigger sum
                    left++;

                } else {

                    // Need a smaller sum
                    right--;
                }
            }
        }

        return ans;

    }
}