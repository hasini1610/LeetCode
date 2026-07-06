class Solution {
      //recursive
    public double func(double x,long n){
        if(n==0) return 1;
        if(n%2==1){
           return x*func(x,n-1);
        }
        return func(x*x,n/2);
    }
    public double myPow(double x, int n) {
        long num=n;
        if(n<0){
            x=1/x;
            num=-1*num;
        }
        return func(x,num);
    }
}