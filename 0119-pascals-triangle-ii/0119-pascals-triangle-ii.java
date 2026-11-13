class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>row=new ArrayList<>();
        int n=rowIndex+1;
        row.add(1);
        long ans=1;
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/(i);
            row.add((int)ans);        
        }
        return row;
    }
}