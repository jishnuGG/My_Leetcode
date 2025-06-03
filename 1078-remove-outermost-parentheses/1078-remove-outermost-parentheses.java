class Solution {
    public String removeOuterParentheses(String s) {
      //  int i=0;
        int n=s.length();
        String res="";
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==')') count--;
            if(count!=0)
            {
                res+=s.charAt(i);
            }
            if(s.charAt(i)=='(') count++;
        }
        return res;

    }
}