class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        int n=nums.length;
        if(n%2!=0) return false;
        for(int val:nums)
        {
            hs.put(val,hs.getOrDefault(val,0)+1);
        }
        int count=0;
        int diff=0;
        boolean falg=true;
        for(Map.Entry<Integer,Integer> Entry:hs.entrySet())
        {
            if(Entry.getValue()%2==0)
            count=count+Entry.getValue();
        }
        
        if(count==n)
        {
            return true;
        }
        return false;
    }
}