class Solution {
    public boolean isValid(String ans,int i){
        if(i>=(ans.length()/2)){
            return true;
        }
        if(ans.charAt(i)!=ans.charAt(ans.length()-1-i)){
            return false;
        }
        return isValid(ans,i+1);
    }
    public boolean isPalindrome(String s) {
        //uppercase letters (A-Z) range from 65 to 90 and lowercase letters (a-z) range from 97 to 122
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
           if(Character.isLetterOrDigit(s.charAt(i))){
                ans.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return isValid(ans.toString(),0);
    }
}