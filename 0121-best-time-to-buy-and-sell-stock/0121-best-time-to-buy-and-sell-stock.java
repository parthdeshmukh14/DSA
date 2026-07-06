class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=Integer.MAX_VALUE;
        int profit=0;
        int maxresult=0;
        for(int i=0;i<n;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                profit=prices[i]-buy;
                maxresult=Math.max(maxresult,profit);
            }
        }
        return maxresult;
    }
}