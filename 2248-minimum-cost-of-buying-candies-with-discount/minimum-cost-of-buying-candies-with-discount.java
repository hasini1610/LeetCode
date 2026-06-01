class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n=cost.length;
        for(int i=0;i<(n/2);i++){
            int t=cost[i];
            cost[i]=cost[n-i-1];
            cost[n-i-1]=t;
        }
        int minCost=0;
        for(int i=0;i<n;i++){
            if(i%3!=2){
                minCost+=cost[i];
            }
        }
        return minCost;
    }
}