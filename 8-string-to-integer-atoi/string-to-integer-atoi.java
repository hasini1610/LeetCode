class Solution {
    public int myAtoi(String s) {
        if(s==null) return 0;
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        long ans=0;
        int sign=+1;
        int i=0;
        int MAX= Integer.MAX_VALUE , MIN=Integer.MIN_VALUE;
        if(s.charAt(0)=='-'){
            sign=-1;
        }
        if(s.charAt(i)=='-'||s.charAt(i)=='+') i=1;
        while(i<s.length()){
            if(s.charAt(i)==' '|| !Character.isDigit(s.charAt(i))){
                break;
            }
            ans=ans*10+s.charAt(i)-'0';
            if(sign==-1 && ans*sign<MIN){
                return MIN;
            }
            if(sign==1 && ans*sign>MAX){
                return MAX;
            }
            i++;
        }
        return (int)(ans*sign);
    }
}