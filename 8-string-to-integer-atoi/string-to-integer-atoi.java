class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        char arr[]=s.toCharArray();
        if(arr.length==0){
            return 0;
        }
        boolean isnegative=false;
        int index=0;
        if(arr[0]=='-'){
            isnegative=true;
            index++;
        }
        else if(arr[0]=='+'){
            index++;
        }
        long number=0;
        for(int i=index;i<arr.length;i++){
            if(arr[i]>='0' && arr[i]<='9'){
            number=(number*10)+ (arr[i]-48);

            if(!isnegative && number>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            else if(isnegative && -number<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            }
            else{
                break;
            }
        }
        if(isnegative){
            number*=-1;
        }

        return (int)number;

    }
}