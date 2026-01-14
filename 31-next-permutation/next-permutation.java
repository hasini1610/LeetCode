class Solution {
     public static void rev(int arr[],int a,int b){
       int p1=a;
       int p2=b;
       while(p1<=p2){
        int temp=arr[p1];
        arr[p1]=arr[p2];
        arr[p2]=temp;
        p1++;
        p2--;
       }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
              index=i;
              break;
            }
        }
        if(index==-1){
            rev(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        rev(nums,index+1,n-1);
    }
}