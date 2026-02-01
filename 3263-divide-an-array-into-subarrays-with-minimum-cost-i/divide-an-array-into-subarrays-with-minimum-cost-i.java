class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        int score=nums[0];
        int mini=Integer.MAX_VALUE;
        int secMini=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(nums[i]<mini){
                secMini=mini;
                mini=nums[i];
            }
            else if(nums[i]<secMini){
                secMini=nums[i];
            }
        }
        return (score+mini+secMini);
    }
}