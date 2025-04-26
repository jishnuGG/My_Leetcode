class Solution {
    public boolean isabsent(String s,int n){
        int count=0;
        for(int i=0;i<n;i++){
           if(s.charAt(i)=='A') count++;
        }
        if(count>=2){
            return false;
        }
        return true;

    }
    public boolean islate(String s,int n){
            int count=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='L')
                {
                    count++;
                    for(int j=i+1;j<n && s.charAt(j)=='L';j++)
                    {
                          if(s.charAt(i)=='L') count++;
                    }
                    if(count>=3) return false;
                }
                count=0;
            }
            return true;
    }
    public boolean checkRecord(String s) {
        int n=s.length();
        boolean absent=isabsent(s,n);
        boolean present=islate(s,n);
        return absent&&present;
    }
}