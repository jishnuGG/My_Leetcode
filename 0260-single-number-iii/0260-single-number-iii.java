class Solution {
    public int[] singleNumber(int[] nums) {
       HashMap<Integer,Integer> hs=new HashMap<>();
       ArrayList<Integer> arr=new ArrayList<>();
       for(int val:nums)
       {
          hs.put(val,hs.getOrDefault(val,0)+1);
       }
       for(Map.Entry<Integer,Integer> ls:hs.entrySet())
       {
          if(ls.getValue()==1)
          arr.add(ls.getKey());
       }
       int n=arr.size();
       int[] res=new int[n];
       int i=0;
       for(int val:arr)
       res[i++]=val;
       return res;
    }
}