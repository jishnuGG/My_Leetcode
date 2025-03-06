class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int n1=grid[0].length;
        int N=n*n1;
        HashSet<Integer> arr=new HashSet<>();
        int[] result=new int[2];
        HashSet<Integer> hs=new HashSet<Integer>();
        int repeated=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n1;j++)
            {
                 if(hs.contains(grid[i][j])){
                    repeated=grid[i][j];
                 }
                 else{
                    hs.add(grid[i][j]);
                 }
            }
        }
        int k=1;
        int missing=1;
        for(int val:hs)
        {
            if(!hs.contains(N) && N>0)
            {
                missing=N;
                break;
            }
            N--;
        }
        result[0]=repeated;
        result[1]=missing;
        return result;
    }
}