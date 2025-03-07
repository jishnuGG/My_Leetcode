class Solution {
    public boolean isprime(int n)
    {
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int[] result=new int[2];
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isprime(i))
            {
                arr.add(i);
            }
        }
        int size=arr.size();
        int[] a=new int[size];
        int i=0;
        for(int val:arr)
        {
            if(i<size)
            a[i++]=val;
        }
        int st=0;
        int ed=Integer.MAX_VALUE;
        for(i=1;i<size;i++)
        {
            if(a[i]-a[i-1]<(ed-st) )
            {
                st=a[i-1];
                ed=a[i]; 
            }
        }
        if(st==0)
        {
        result[0]=-1;
        result[1]=-1;
        }
        else{
         result[0]=st;
         result[1]=ed;
        }
        return result;
       // return a;
    }
}