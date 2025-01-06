class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int n=s.length();int i=0,j=0,a=0;
        while(i<n && j<n)
        {
           if(!hs.contains(s.charAt(i)))
           {
            hs.add(s.charAt(i));
            a=Math.max(a,i-j+1);
            i++;
           }
           else{
            hs.remove(s.charAt(j));
            j++;
           }
        }
        return a;
    }
}