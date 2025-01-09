class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int shiftcount=0;
        while(m!=n)
        {
            m>>=1;
            n>>=1;
            shiftcount++;
        }
        return m<<shiftcount;
    }
}