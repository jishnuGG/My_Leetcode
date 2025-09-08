class Solution {
    public boolean helper(int i)
    {
        while(i>0)
        {
            int rem=i%10;
            if(rem==0) return false;
            i=i/10;
        }
      return true;
    }
    public int[] getNoZeroIntegers(int n) {

        int[] arr=new int[2];
        if(!helper(n-1))
        {
        int j=1;
        for(int i=n-1;i>0 && j<=n/2;i--)
        {
            if(i+j==n && helper(i) && helper(j))
            {
                arr[0]=i;
                arr[1]=j;
                break;
            }
              j++;
            }
        }
        
        else{
            arr[0]=n-1;
            arr[1]=1;
        }
        return arr;
    }
}