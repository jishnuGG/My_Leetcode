class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] leftSum=new int[n];
        int[] rightSum=new int[n];
        leftSum[0]=0;
       int[] answer=new int[n];
        rightSum[n-1]=0;
        for(int i=0;i<n;i++)
        {
            int lsum=0;
            for(int j=0;j<i;j++)
            {
                lsum+=nums[j];
            }
            if(i!=0)leftSum[i]=lsum;
            int rsum=0;
            for(int k=i+1;k<n;k++)
            {
               rsum+=nums[k];
            }
            rightSum[i]=rsum;
        }
        for(int i=0;i<n;i++)
        {
            answer[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return answer;
    }
}