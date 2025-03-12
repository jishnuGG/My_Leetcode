class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int n1=grid.length;
        int n2=grid[0].length;
       int j=0;
       if(n2==0)n2=1;
        for(int i=0;i<n1*n2;i++)
        {
            if(grid[i%n1][i/n1]<0)
            count++;
            j++;
        }
        return count;
    }
}