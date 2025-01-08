class Solution {
    public boolean helper(String w1,String w2){
        int n1=w1.length();
        int n2=w2.length();
        boolean prefix=false;
        boolean suffix=false;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(w1.charAt(i)==w2.charAt(j))
            {
                i++;j++;
            }
            else break;
        }
        if(i==n1) prefix=true;
        i=n1-1;
        j=n2-1;
        while(i>=0 && j>=0)
        {
             if(w1.charAt(i)==w2.charAt(j)){
                i--;j--;
             }
             else break;
        }
        if(i<0) suffix=true;
        return prefix && suffix;
    }
    public int countPrefixSuffixPairs(String[] words) {
       int count=0;
       for(int i=0;i<words.length;i++){
        for(int j=i+1;j<words.length;j++){
            if(helper(words[i],words[j])){
                count++;
            }
        }
       }
       return count;
    }
}