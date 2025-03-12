class Solution {
    public int helper(int low,int high,int target,int[] nums)
    {
        int mid=low+(high-low)/2;
        if(low<=high)
        {
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(target>nums[mid])
        {
            return helper(mid+1,high,target,nums);
        }
        else if(target<nums[mid])
        {
           return helper(low,mid-1,target,nums);
        }
        }
         return -1;
    }
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        return helper(start,end,target,nums);
    }
}