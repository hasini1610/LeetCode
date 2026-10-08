class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int sufix[]=new int[n];
        int prod=1;
        for(int i=0;i<n;i++){
            prefix[i]=prod;
            prod*=nums[i];
        }
        prod=1;
        for(int i=n-1;i>=0;i--){
            sufix[i]=prod;
            prod*=nums[i];
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = prefix[i] * sufix[i];
        }
        return ans;
    }
}