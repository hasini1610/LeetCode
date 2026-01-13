class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int ans[]=new int[]{-1,-1};
        for(int i=0;i<n;i++){
            int num=nums[i];
            int more=target-num;
            if(mpp.containsKey(more)){
              ans[0]=i;
              ans[1]=mpp.get(more);
              return ans;
            }
            mpp.put(nums[i],i);
        }
        return ans;
    }
}