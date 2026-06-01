class Solution {
    public int helper(String s,int i,int sign,long num){
        if(i>=s.length() || !Character.isDigit(s.charAt(i))){
            return (int)(sign*num);
        }
        num=num*10+(s.charAt(i)-'0');
        if(num*sign >=Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(num*sign <=Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return helper(s,i+1,sign,num);

    }
    public int myAtoi(String s) {
        s=s.trim();
        int n=s.length();
        if(n==0) return 0;
        int i=0;
        int sign=1;
        long num=0;
        if(i<n && s.charAt(i)=='-' ){
            sign=-1;
            i++;
        }
        else if(i<n && s.charAt(i)=='+'){
            i++;
        }
        return helper(s,i,sign,num);
    }
}