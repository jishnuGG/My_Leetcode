class Solution {
    public String removeTrailingZeros(String num) {
        int n=num.length();
        String result=num;
   //     if(!num.contains("00")) return num;
        int i=n-1;
        while(i>=0)
        {
            if(num.charAt(i)=='0')
            {
                result=num.substring(0,i);
            }
            else{
                break;
            }
            i--;
        }
        
        return result;
    }
}