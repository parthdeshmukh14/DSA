class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        // int left=0;
        // int right=n-1;
        // while(left<right){
        //     if(nums[left]>nums[right]){
        //         int temp=nums[left];
        //         nums[left]=nums[right];
        //         nums[right]=temp;
        //         left++;
        //         right--;
        //     }
            
        //     else{
        //         left++;
        //     }
        // }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }

    }
}