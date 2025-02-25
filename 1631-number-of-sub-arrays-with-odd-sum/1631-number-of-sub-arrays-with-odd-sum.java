class Solution {
    public int numOfSubarrays(int[] arr) {
        int count=0;
        int n=arr.length;
        int prefix_sum=0;
        int oc=0;
        int ec=1;
        int mod=1_000_000_007;
        for(int i=0;i<n;i++)
        {
            prefix_sum+=arr[i];
            if(prefix_sum%2!=0)
            {
                count=(count+ec)%mod;
                oc++;
            }
            else{
               count=(count+oc)%mod;
                ec++;
            }
        }
        return count;
    }  
}