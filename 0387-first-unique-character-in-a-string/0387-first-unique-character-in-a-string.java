class Solution {
    public int firstUniqChar(String s) {
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
           boolean flag=true;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j) && i!=j)
                {
                    flag=false;
                    break;
                }
            }
            if(flag) return i;
        }
        return -1;
    }
}