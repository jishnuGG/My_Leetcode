class Solution {
    // public boolean alreadypresent(String s,int k)
    // {
    //     int count=0;
    //     for(int i=1;i<s.length();i++)
    //     {
    //         if(s.charAt(i)=='B'&& s.charAt(i-1)=='B' && s.charAt(i-1)==s.charAt(i))
    //         {
    //             count++;
    //         }
    //         else count=0;
    //         if(count>=k)
    //         {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public int minimumRecolors(String s, int k) {
        int result=0;
   ///     if(alreadypresent(s,k)) return 0;
        int n=s.length();
        int l=0;int res=0;
        int min=k;
        for(int r=0;r<n;r++)
        {
            if(s.charAt(r)=='W') res++;
            if(r-l+1==k){ 
                min=Math.min(res,min);
                if(s.charAt(l)=='W')
                res--;
                l++;
                }
        }
        return min;
    }
}