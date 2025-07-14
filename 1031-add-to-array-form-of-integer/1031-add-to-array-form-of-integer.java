import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result=new ArrayList<Integer>();
        String res="";
        for(int val:num){
            res+=val;
        }
        BigInteger num1=new BigInteger(res);
        BigInteger num2=BigInteger.valueOf(k);
        BigInteger sum=num1.add(num2);
        String str=sum.toString();
        int i=0;
        while(i<str.length())
        {
            result.add(str.charAt(i)-'0');
            i++;
        }
        return result;
    }
}