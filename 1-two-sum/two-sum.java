class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer>mpp=new HashMap<>();
        int n=nums.length;
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            int a=nums[i];
            int more=target-a;
            if(mpp.containsKey(more)){
             ans[0]=mpp.get(more);
             ans[1]=i;
             return ans;
            }
            mpp.put(nums[i],i);
        }
        return ans;
    }
}