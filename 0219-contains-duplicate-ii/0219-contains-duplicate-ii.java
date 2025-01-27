class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
            if(hs.size()>k){
                hs.remove(nums[i-k]);
            }
        }
        return false;
    }
}