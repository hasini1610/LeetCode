class Solution {
   long func(int piles[],int mid){
        long totalhrs=0L;
         for (int i : piles) {
            totalhrs += (int)Math.ceil((double)i / mid);
        }
        return totalhrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
     int n=piles.length;
     Arrays.sort(piles);
     int low=1,high=piles[n-1];
     int ans=0;
     long totalhrs=0;
     while(low<=high){
        int mid=(low+high)/2;
        totalhrs=func(piles,mid);
        if(totalhrs<=h){
        ans=mid;
        high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return low;
    }
}