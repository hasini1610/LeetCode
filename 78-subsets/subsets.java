class Solution {
    public void print(int i,int nums[],int n,List<List<Integer>>ans, List<Integer>li){
       if(i>=n){
           ans.add(new ArrayList<>(li));
           return ;
       }
       li.add(nums[i]);
       print(i+1,nums,n,ans,li);
       li.remove(li.size()-1);
       print(i+1,nums,n,ans,li);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        print(0,nums,n,ans,new ArrayList<Integer>());
        return ans;
    }
}