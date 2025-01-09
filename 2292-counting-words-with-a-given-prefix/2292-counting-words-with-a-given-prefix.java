class Solution {
    public boolean helper(String s,String pref){
        return s.startsWith(pref);
    }
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int n=words.length;
        for(int i=0;i<n;i++){
            if(helper(words[i],pref)){
                count++;
            }
        }
        return count;
    }
}