class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans=new ArrayList<>();
        int[] max=new int[26];
        for(String b:words2){
            int[] temp=counter(b);
            for(int i=0;i<26;i++){
                max[i]=Math.max(temp[i],max[i]);
            }
        }
        for(String b:words1){
            if(isuniversal(counter(b),max)){
                ans.add(b);
            }
        }
        return ans;
    }
    public boolean isuniversal(int[] countA,int[] countB){
        for(int i=0;i<26;i++){
            if(countA[i]<countB[i])return false;
        } return true;
    }
    public int[] counter(String word){
        int[] count=new int[26];
        for(char c:word.toCharArray()){
            count[c-'a']++;
        }
        return count;
    }
}