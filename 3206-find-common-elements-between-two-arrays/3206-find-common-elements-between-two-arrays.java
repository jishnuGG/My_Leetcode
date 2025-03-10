class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result=new int[2];
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int val:nums1) arr1.add(val);
        for(int val:nums2) arr2.add(val);
        int count1=0;
        int count2=0;
        for(int val:arr1) 
        {
            if(arr2.contains(val))
            {
                count1++;
            }
        }
        result[0]=count1;
          for(int val:arr2) 
        {
            if(arr1.contains(val))
            {
                count2++;
            }
        }
        result[1]=count2;
        return result;
    }
}