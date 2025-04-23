class Solution {
    public int countLargestGroup(int n) {
        int maxcount=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        int i=1;
        int max=0;
        while(i<=n)
        {
            int tem=i;
            int size=1;
            int sum=0;
            while(tem>0)
            {
                sum=sum+tem%10;
                size++;
                tem=tem/10;
            }
            hs.put(sum,hs.getOrDefault(sum,0)+1);
            if(hs.get(sum)>max)
            {
                max=hs.get(sum);
            }
            i++;
        }

        for(Map.Entry<Integer,Integer> entry:hs.entrySet())
        {
            if(max==entry.getValue())
            {
                maxcount++;
            }
        }
        return maxcount;
    }
}