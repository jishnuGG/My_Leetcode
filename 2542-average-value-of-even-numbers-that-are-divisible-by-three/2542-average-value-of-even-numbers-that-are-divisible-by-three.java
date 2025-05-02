class Solution {
    public int averageValue(int[] nums) {
        int res=0;
        int sum=0; int count=1;
        for(int val:nums)
        {
            if(val%3==0 && val%2==0)
            {
                sum+=val;
                count++;
            }
        }
        if(count==1) return 0;
        count=count-1;
        res=Math.round(sum/count);
        return res;
    }
}