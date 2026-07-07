class Solution {
    public void generate(int n,int open, int close,String s,List<String> res){
        if(open>n) return;
        if((open+close)==2*n && (open==close)){
            res.add(s);
        }
        if(open<n){
            generate(n,open+1,close,s+'(',res);
        }
        if(open>close){
            generate(n,open,close+1,s+')',res);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        generate(n,0,0,"",res);
        return res;
    }
}