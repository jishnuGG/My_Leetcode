class Solution {
    public void helper(int[] nums,int i)
    {
        nums[i]^=1;
        nums[i+1]^=1;
        nums[i+2]^=1;
    }
    public int minOperations(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            if(nums[i]==1) continue;
            helper(nums,i);
            count++;
        }
        if(nums[n-2]==0 || nums[n-1]==0)
        return -1;
        return count;
    }
}