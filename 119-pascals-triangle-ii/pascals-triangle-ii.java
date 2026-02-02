import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n=rowIndex+1;
        List<Integer>ans=new ArrayList<>();
        long j=1;
        ans.add((int)j);
        for(int i=1;i<n;i++){
            j=j*(n-i);
            j=j/i;
           ans.add((int)j);
        }
        return ans;
    }
}