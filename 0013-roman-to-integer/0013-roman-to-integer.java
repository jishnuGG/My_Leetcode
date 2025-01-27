class Solution {
    public int romanToInt(String s) {
        String[] str=new String[s.length()];
        for(int i=0;i<s.length();i++)
        {
            str[i]=String.valueOf(s.charAt(i));
        }
        Map<String,Integer> map=new HashMap<>();
                map.put("I",1);
                map.put("V",5);
                map.put("X",10);
                map.put("L",50);
                map.put("C",100);
                map.put("D",500);
                map.put("M",1000);

        int result=0;
        int prev=0;
        for(int i=str.length-1;i>=0;i--)
        {
            String currChar=str[i];
            int currvalue=map.get(currChar);
            if(currvalue<prev){
                result-=currvalue;
            }
            else{
                result+=currvalue;
            }
            prev=currvalue;
        }
        return result;
    }
}