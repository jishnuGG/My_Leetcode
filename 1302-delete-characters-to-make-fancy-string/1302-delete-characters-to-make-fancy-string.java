class Solution {
    public String makeFancyString(String s) {
        int count=1;
        int n=s.length();
    if(n<=2) return s;
         char prev=s.charAt(0);
         StringBuilder str=new StringBuilder();
         str.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==prev) count++;
            else{
                prev=s.charAt(i);
                count=1;
            }
            if(count<3) str.append(s.charAt(i));

        }
        return str.toString();
    }
}