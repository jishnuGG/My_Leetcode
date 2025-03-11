class Solution {
    public int findMiddleIndex(int[] nums) {
        int result=-1;
        int totalsum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        int curr=0;
        for(int i=0;i<n;i++)
        {
            curr+=nums[i];
            if(curr-nums[i]==totalsum-curr)
            {
                return i;
            }
        }
        return -1;
    }
}