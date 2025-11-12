class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i=0;
    int j=0;
    ArrayList<Integer> union=new ArrayList<>();
    while(i<m && j<n){
    if(nums1[i]<=nums2[j]){
        
        union.add(nums1[i]);
        i++;
    }
    else{
        
        union.add(nums2[j]);
        j++;
    }
    }
    
    while(i<m){
        union.add(nums1[i]);
        i++;
    }
    while(j<n){
        union.add(nums2[j]);
        j++;
    }
    
    int k=0;
    for(int x:union){
        nums1[k]=x;
        k++;
    }
    }
}