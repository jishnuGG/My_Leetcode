class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int val:nums){
            if(!hs.contains(val))
            {
                hs.add(val);
            }
            else{
                return true;
            }
        }
        return false;
    }
}