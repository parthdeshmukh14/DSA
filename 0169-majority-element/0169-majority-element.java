class Solution {
    public int majorityElement(int[] nums) {
        // int cnt=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             cnt++;
        //         }
        //     }
        //     if(cnt>(nums.length/2)){
        //         return nums[i];
        //     }
        //     cnt=0;
        // }
        // return 0;
        //optimized version
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return 0;
    }
}