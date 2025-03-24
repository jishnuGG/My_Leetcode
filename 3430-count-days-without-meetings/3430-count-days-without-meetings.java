class Solution {
    public int countDays(int days, int[][] meetings) {
         Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int count=0;int prev=1;
        for(int[] meeting:meetings)
        {
            int start=meeting[0];
            int end=meeting[1];
            if(start>prev)
            {
                count+=start-prev;
            }
             prev=Math.max(prev,end+1);
        }
        return count+Math.max(0,days-prev+1);
    }
}