class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int max=-1;
        for(int i=0;i<n;i++){
            int diff=0;
            for(int j=i+1;j<n;j++){
               diff=nums[j]-nums[i];
               max=Math.max(max,diff);
            }
        }
        return max;
    }
}