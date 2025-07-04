class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
           
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            carry=sum/2;
            str.append(sum%2);
        }
        String res=str.reverse().toString();
        return res;
    }
}