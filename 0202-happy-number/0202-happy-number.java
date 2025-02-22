class Solution {
    public boolean helper(int n)
    {
        int slow=h2(n);
        int fast=h2(h2(n));
        while(slow!=fast)
        {
        slow=h2(slow);
        fast=h2(h2(fast));
        }
        return slow==1;
    }
    public int h2(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=Math.pow(n%10,2);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        if(n<=0) return false;
        boolean ans=helper(n);
        return ans;
    }
}