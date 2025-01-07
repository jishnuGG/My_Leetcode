class Solution {
    public String makeSmallestPalindrome(String s) {
        int n=s.length();
        char start;char end;
        int i=0,j=n-1;
        StringBuilder sb=new StringBuilder(s);
        while(i<n && j>=0)
        {
            start=s.charAt(i);
            end=s.charAt(j);
            if(start!=end)
            {
                if((int)start<(int)end)
                sb.setCharAt(j,start);
                else
                sb.setCharAt(i,end);
            }
            i++;
            j--;
        }
        return sb.toString();
    }
}