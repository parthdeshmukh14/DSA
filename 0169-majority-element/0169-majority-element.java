class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt>(nums.length/2)){
                return nums[i];
            }
            cnt=0;
        }
        return 0;
    }
}