class Solution {
    public List<Integer> row(int n){
        List<Integer>li=new ArrayList<>();
        int ans=1;
        li.add(1);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            li.add(ans);
        }
        return li;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>tri=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            tri.add(row(i));
        }
        return tri;
    }
}