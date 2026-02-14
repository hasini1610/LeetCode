class Solution {
    public int reverse(int x) {
        long rev=0,rem=0;
        while(x!=0){
            rem=x%10;
            if(rev>(Integer.MAX_VALUE/10)|| rev<(Integer.MIN_VALUE/10)){
                return 0;
            }
            rev=rev*10+rem;
            x=x/10;
        }
        return (int)rev;
    }
    public boolean isSameAfterReversals(int num) {
        int n=reverse(num);
        int m=reverse(n);
        if(m==num){
                return true;
        }
        return false;
    }
}