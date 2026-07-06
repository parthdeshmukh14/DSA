class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean isFound=false;
        int n=nums.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             isFound=true;
        //             break;
        //         }
        //     }
        // }
        // if(isFound){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        HashSet<Integer> myset=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!myset.contains(nums[i])){
                myset.add(nums[i]);
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}