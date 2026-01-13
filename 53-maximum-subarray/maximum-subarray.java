class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int cur_max=nums[0];
        int maxi=nums[0];
        for(int i=1;i<n;i++){
            cur_max=Math.max(nums[i],cur_max+nums[i]);
            maxi=Math.max(maxi,cur_max);
        }
        return maxi;
    }
}