class Solution {
    public int sumFourDivisors(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            ArrayList<Integer>ans=new ArrayList<>();
             int cnt=0;
            for(int j=1;j<=Math.sqrt(nums[i]);j++){
                if(nums[i]%j==0){
                    ans.add(j);
                    cnt+=j;
                    if(j!=(nums[i]/j)){
                        ans.add(nums[i]/j);
                        cnt+=nums[i]/j;
                    }
                }
            }
            if(ans.size()==4){
              res+=cnt;
            }
        }
      return res;
    }
}