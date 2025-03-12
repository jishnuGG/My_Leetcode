class Solution {
    public int maximumCount(int[] nums) {
        int pos=0;int neg=0;
        for(int val:nums)
        {
            if(val>0) pos++;
            if(val<0) neg++;
        }
        return Math.max(pos,neg);
    }
}