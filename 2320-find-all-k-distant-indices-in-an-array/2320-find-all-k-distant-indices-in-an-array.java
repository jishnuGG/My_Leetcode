class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                arr.add(i);
            }
        }
        for(int i=0;i<n;i++){
            boolean istrue=false;
            int index=0;
            for(int val:arr){
                int curr=Math.abs(val-i);
                if(curr<=k)
                {
                   istrue=true;
                   index=val;
                   break;
                }   
            }
            if(istrue && nums[index]==key)
            {
                res.add(i);
            }
        }
        return res;
    }
}