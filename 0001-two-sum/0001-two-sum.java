class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute sol
        // int n=nums.length;
        // int pt1=0;
        // int pt2=0;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
            
        //     int sum=nums[i]+nums[j];
        //     if(sum==target){
        //         pt1=i;
        //         pt2=j;
        //     }
        //     }
           
        // }
        // return new int[] {pt1,pt2};

        //optimal solution
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}