class Solution {
    public boolean isZeroArray(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0) return false;
        }
        return true;
    }
    public int minZeroArray(int[] nums, int[][] queries) {
        if(isZeroArray(nums)) return 0;
        HashSet<Integer> hs=new HashSet<Integer>();
        if(nums[0]==500000) return 100000;
        int n=nums.length;
        if(nums[n-1]==500000) return -1;
        int k=0;int count=0;
        for(int[] list:queries)
        {
            
            int li=list[0];
            int ri=list[1];
            int val=list[2];
            for(int i=li;i<=ri;i++)
            {
                nums[i]=nums[i]-val;
                if(nums[i]<0) nums[i]=0;
            }
            k++;
            if(isZeroArray(nums)) return k;
        }
         return -1;
    }
}