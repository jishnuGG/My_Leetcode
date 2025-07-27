class Solution {
    public boolean isMonotonic(int[] arr) {
        int n=arr.length;
        boolean res1=true;
        boolean res2=true;
        for(int i=0;i+1<n;i++)
        {
             if(arr[i]>arr[i+1])
             {
                res1=false;
             }
        }
        for(int i=0;i+1<n;i++)
        {
            if(arr[i]<arr[i+1]) res2=false;
        }
        return res1||res2;
    }
}