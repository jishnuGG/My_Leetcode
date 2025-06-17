class Solution {
    int MOD=1000000007;
    public long helper(long a,long b){
        long res=1;
        while(b>0){
            if ((b & 1) == 1) { // if b is odd
                res = (res * a) % MOD;
            }
                a=(a*a)%MOD;
                b=b/2;
            
        }
        return res;
    }
    public int countGoodNumbers(long n) {
       
       long even=n-n/2;
       long odd=n/2;
       
       return (int)(helper(5,even)*helper(4,odd)%MOD);
    }
}