class Solution {
    public String findValidPair(String s) {
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        String str=new String("");
        for(int i=0;i<s.length();i++)
        {
            int val=s.charAt(i)-'0';
            hs.put(val,hs.getOrDefault(val,0)+1);
        }
        if(hs.size()>=2)
        {
           for(int i=0;i<s.length()-1;i++)
           {
              int first=s.charAt(i)-'0';
              int sec=s.charAt(i+1)-'0';
              if(first!=sec && hs.get(first)==first && hs.get(sec)==sec)
              {
                return ""+Integer.toString(first)+Integer.toString(sec);
              }
           }
        }
        return str;
    }
}