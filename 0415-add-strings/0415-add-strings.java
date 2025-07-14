class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0)
        {
            int sum=carry;
            if(i>=0)
            {
                int c1=num1.charAt(i)-'0';
                sum+=c1;
            }
            if(j>=0)
            {
                int c2=num2.charAt(j)-'0';
                sum+=c2;
            }
            str.append(sum%10);
            carry=sum/10;
            i--;j--;
        }
        if(carry>0)
        str.append(carry);
        return str.reverse().toString();
    }
}