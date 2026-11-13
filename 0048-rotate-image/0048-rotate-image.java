class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<n;i++){
            int p1=0,p2=n-1;
            while(p1<p2){
                int t=matrix[i][p1];
                matrix[i][p1]=matrix[i][p2];
                matrix[i][p2]=t;
                p1++;
                p2--;
            }
        }
    }
}