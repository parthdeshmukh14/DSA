class Solution {
    public int fib(int n) {
        // if(n==0){
        //     return 0;
        // }
        // else if(n==1){
        //     return 1;
        // }
        // else{
        //     return fib(n-1)+fib(n-2);
        // }
        int left=0;
        int right=1;
        int op=0;
             if(n==0){
            return left;
        }
            else if(n==1){
            return right;
        }
        for(int i=2;i<=n;i++){
       
            op=left+right;
            left=right;
            right=op;
        }
        return op;

    }
}