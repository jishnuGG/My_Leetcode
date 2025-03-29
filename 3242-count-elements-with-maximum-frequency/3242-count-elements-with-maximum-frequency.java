class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int max=0;
        for(int val:nums)
        {
            hs.put(val,hs.getOrDefault(val,0)+1);
            if(max<hs.get(val))
            {
                max=hs.get(val);
            }
        }
        int res=0;
        for(Map.Entry<Integer,Integer> ls:hs.entrySet())
        {
            if(max==ls.getValue())
            {
                res+=max;
            }
        }
        return res;
    }
}