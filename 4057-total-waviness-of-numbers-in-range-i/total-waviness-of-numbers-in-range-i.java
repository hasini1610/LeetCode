class Solution {
    public int wave(String s){
        int cnt=0;
        for(int i=1;i<s.length()-2;i++){
            int m=s.charAt(i);
            int l=s.charAt(i-1);
            int r=s.charAt(i+1);
            if(m>l && m>r){
                cnt++;
            }
            if(m<l && m<r){
                cnt++;
            }
        }
        return cnt;
    }
    public int totalWaviness(int num1, int num2) {
        int score=0;
        for(int i=num1;i<=num2;i++){
            String s=i+" ";
            score+=wave(s);
        }
        return score;
    }
}