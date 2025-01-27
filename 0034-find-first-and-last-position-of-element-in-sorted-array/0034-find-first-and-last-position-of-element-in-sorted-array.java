class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        int n=nums.length;
        int i=0;
        for(i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                first=i;
                break;
            }
        }
        for(int j=i;j<n;j++)
        {
            if(nums[j]==target)
            {
                last=j;
            }
            if(nums[j]!=target) break;
        }
        int[] arr=new int[2];
        arr[0]=first;
        arr[1]=last;
        return arr;
    }
}