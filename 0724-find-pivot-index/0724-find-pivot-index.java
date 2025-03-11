class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;int n=nums.length;
        int curr=0;
        for(int val:nums) totalsum+=val;
        for(int i=0;i<n;i++)
        {
            int right=totalsum-curr-nums[i];
            if(curr==right) return i;
            curr+=nums[i];
        }
        return -1;
    }
}