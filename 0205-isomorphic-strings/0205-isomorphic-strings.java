class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] a=new int[256];
        int[] b=new int[256];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(a[ch1]==0) a[ch1]=ch2;
            if(b[ch2]==0) b[ch2]=ch1;
            if(a[ch1]!=ch2 || b[ch2]!=ch1){
                return false;
            }
        }
        return true;
    }
}