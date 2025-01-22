class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m=isWater.length;
        int n=isWater[0].length;
        int[][] height=new int[m][n];
        Queue<int[]> qs=new LinkedList<>();
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isWater[i][j]==1)
                {
                    qs.offer(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        int l=0;
        int[] direction={-1,0,1,0};
         while(!qs.isEmpty()){
            int size=qs.size();
            for(int i=0;i<size;i++)
            {
                int[] curr=qs.poll();
                int x=curr[0];
                int y=curr[1];
                for(int k=0;k<4;k++)
                {
                    int newx=x+direction[k];
                    int newy=y+direction[(k+1)%4];
                    if(isValid(newx,newy,m,n) && visited[newx][newy]==false)
                    {
                       qs.offer(new int[]{newx,newy});
                       visited[newx][newy]=true;
                       height[newx][newy]=1+l;
                    }
                }
            }l++;
         }
       return height;
    } 
    public boolean isValid(int x,int y,int m,int n)
         {
            return (x>=0 && x<m && y>=0 && y<n);
         }
}