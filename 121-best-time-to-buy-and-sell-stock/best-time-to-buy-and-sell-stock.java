class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int mini=prices[0];
        int profit=0;
        for(int i=0;i<n;i++){
            int sell=prices[i]-mini;
            profit=Math.max(sell,profit);
            mini=Math.min(mini,prices[i]);
        }
        return profit;
    }
}