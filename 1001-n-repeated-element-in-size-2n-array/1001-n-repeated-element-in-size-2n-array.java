class Solution {
    public int repeatedNTimes(int[] nums) {
        int result=0;
        int count=1;
        HashSet<Integer> hs=new HashSet<>();
        for(int val:nums)
        {
            if(hs.contains(val))
            {
                count++;
                result=val;
            }
           hs.add(val);
        }
        if(count*2 == nums.length)
        {
            return result;
        }
        else
        return 0;
    }
}