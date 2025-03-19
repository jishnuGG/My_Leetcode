class Solution {
    public int addDigits(int num) {
        int res=num;
        while(res>=10)
        {
            int sum=0;
            int n=res;
            while(n>0)
            {
                sum=sum+n%10;
                n=n/10;
            }
            res=sum;
        }
        return res;
    }
}