class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        //this creates an extra time complexity of O(n)
        // for(int i=0;i<n;i++){
        //     if(target<nums[i]){
        //         return i;
        //     }
            
        // }
        return low;
    }
}