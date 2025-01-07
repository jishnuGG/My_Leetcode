class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ls=new ArrayList<>();
        HashSet<String> hs=new HashSet<>();
        int n=words.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(words[i].contains(words[j]))
                {
                    if(!hs.contains(words[j])) hs.add(words[j]);
                }
                if(words[j].contains(words[i]))
                {
                    if(!hs.contains(words[i])) hs.add(words[i]);
                }
            }
        }
        for(String s:hs) ls.add(s);
        return ls;
    }
}