class Solution {
    public String longestPalindrome(String s) {
        String res="";
        String sub;
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            int left=i,right=i;
            while(left>=0 && right<s.length() && (s.charAt(left)==s.charAt(right))){
                 sub=s.substring(left,right+1);
                 if(sub.length()>maxLen){
                    maxLen=sub.length();
                    res=sub;
                 }
                 left--;
                 right++;
              }
          left=i;
          right=i+1;
              while(left>=0 && right<s.length() && (s.charAt(left)==s.charAt(right))){
                 sub=s.substring(left,right+1);
                 if(sub.length()>maxLen){
                    res=sub;
                    maxLen=sub.length();
                 }
                 left--;
                 right++;
              }
        }
        return res;
    }
}