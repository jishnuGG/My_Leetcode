class Solution {
    public int findClosestNumber(int[] nums) {
        int result=0;
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int val:nums)
        {
            int distance=Math.abs(val)-0;
            if(distance<=Math.abs(diff))
            diff=val;
            if(diff==0) break;
        }
        return diff;
    }
}