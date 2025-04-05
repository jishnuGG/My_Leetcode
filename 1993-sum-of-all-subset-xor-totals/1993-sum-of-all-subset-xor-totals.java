class Solution {
    int sum=0;
    public void helper(int index,int[] nums,int curr)
    {
        if(index>=nums.length)
        {
            sum+=curr;
            return;
        }
        helper(index+1,nums,curr^nums[index]);
        helper(index+1,nums,curr);
        return;
    }
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        helper(0,nums,0);
        return sum;
    }
}