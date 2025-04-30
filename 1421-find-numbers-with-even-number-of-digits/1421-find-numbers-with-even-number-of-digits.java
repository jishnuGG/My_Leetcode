class Solution {
    public boolean helper(int n){
        int temp=n;
        int count=0; if(n==0) return false;
        while(temp>0)
        {
           count++;
           temp=temp/10;
        }
        return count%2==0;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int val:nums)
        {
            boolean even=helper(val);
            if(even) { count++;}
        }
        return count;
    }
}