class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] row_count=new int[m];
        int[] col_count=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1) {
                    row_count[i]++;
                    col_count[j]++;
                }
            }
        }
        int res=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && Math.max(row_count[i],col_count[j])>1){
                    res++;
                }
            }
        }
        return res;
    }
}