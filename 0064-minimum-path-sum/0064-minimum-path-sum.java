class Solution {
    public int helper(int[][] grid,int[][] dp,int i,int j){
       
        if(i==0 && j==0) return grid[0][0];
        if(i<0|| j<0) return (int)Math.pow(10,9);
        if(dp[i][j]!=-1) return dp[i][j];
        int up=grid[i][j]+helper(grid,dp,i-1,j);
        int down=grid[i][j]+helper(grid,dp,i,j-1);

        return dp[i][j]=Math.min(up,down);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] memo=new int[m][n];
        for(int[] i:memo) Arrays.fill(i,-1);
        int result=helper(grid,memo,m-1,n-1);
        return result;
    }
}