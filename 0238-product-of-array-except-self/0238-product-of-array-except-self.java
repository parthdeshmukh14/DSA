class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        // int pt=0;
        // int [] res=new int[n];
        // for(int i=0;i<n;i++){
        //     int product=1;
        //     for(int j=0;j<n;j++){
        //         if(i==j){
        //             continue;
        //         }
        //         else{
        //             product=product*nums[j];
        //         }
               
        //     }
        //      res[pt]=product;
        //         pt++;
        // }
        // return res;
        int product=1;
        int []prefix=new int[n];
        int []suffix=new int[n];
        int []res=new int[n];

        //prefix array
        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }

        //suffix array
        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }

        //final ans
        for(int i=0;i<n;i++){
            res[i]=prefix[i]*suffix[i];
        }
        return res;
    }
}