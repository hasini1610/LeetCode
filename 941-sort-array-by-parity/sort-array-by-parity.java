class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int  temp;
        int i=0,j=n-1;
        while(i<j){
            
            while(i<n && nums[i]%2==0){i++;}
            
           
            while(j>=0 && nums[j]%2!=0) j--;
            if(i<j){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
                
            
        }
        return nums;
    }
}