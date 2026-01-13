class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int mini=prices[0];
        int profit=0;
        int sellCst=0;
        for(int i=0;i<n;i++){
            sellCst=prices[i]-mini;
            profit=Math.max(profit,sellCst);
            mini=Math.min(mini,prices[i]);
        }
        return profit;
    }
}