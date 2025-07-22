class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
       int left=0;int right=0;
       int max=Integer.MIN_VALUE;
       int currsum=0;
       while(right<nums.length){
          
          if(hs.contains(nums[right]))
          {
             hs.remove(nums[left]);
             currsum=currsum-nums[left];
             left++;
          }
          else{
            hs.add(nums[right]);
            currsum+=nums[right]; right++;
          max=Math.max(currsum,max);
          }
         
       }
       return max;
    }
}