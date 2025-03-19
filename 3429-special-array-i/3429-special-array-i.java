class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean flag=false;
        int n=nums.length;
        if(n==1) return true;
        for(int i=1;i<n;i++)
        {
            if((nums[i]%2==0 && nums[i-1]%2!=0) || (nums[i]%2!=0 && nums[i-1]%2==0))
            {
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        return flag;
    }
}