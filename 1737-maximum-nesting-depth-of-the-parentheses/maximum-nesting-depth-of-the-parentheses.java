class Solution {
    public int maxDepth(String s) {
        int cnt=0,ans=0;
        for(char x : s.toCharArray()){
            if(x=='('){
                cnt++;
            }
            else if(x==')'){
                cnt--;
            }
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}