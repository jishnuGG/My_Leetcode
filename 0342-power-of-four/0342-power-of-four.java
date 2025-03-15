class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        double logval=Math.log(n)/Math.log(4);
        return logval==(int)logval;
    }
}