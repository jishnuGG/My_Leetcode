class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int N=n+n;
        int[] arr=new int[N];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums[i];
        }
        int j=0;
        for(int i=n;i<N && j<n;i++)
        {
            arr[i]=nums[j++];
        }
        return arr;
    }
}