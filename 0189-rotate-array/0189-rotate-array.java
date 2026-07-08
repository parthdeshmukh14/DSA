class Solution {
    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        // better solution
        int n=nums.length;
         k=k%n;
        // int [] temp=new int[k];
        // int tp=0;
        // for(int i=n-k;i<n;i++){
        //     temp[tp]=nums[i];
        //     tp++;
        // }
        // for(int i=n-k-1;i>=0;i--){
        //     nums[i+k]=nums[i];
        // }
        
        // for(int i=0;i<k;i++){
        //     nums[i]=temp[i];
        //     tp++;
        // }

        //optimal solution
        
        reverse(nums, 0, n - 1);

        
        reverse(nums, 0, k - 1);

        
        reverse(nums, k, n - 1);
    }
}