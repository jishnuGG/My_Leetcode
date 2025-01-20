class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
       int m=mat.length;
       int n=mat[0].length;
       int[] row=new int[m];
       int[] col=new int[n];
       int[] num_row=new int[m*n+1];
       int[] num_col=new int[m*n+1];
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            num_row[mat[i][j]]=i;
            num_col[mat[i][j]]=j;
        }
       }
       for(int i=0;i<arr.length;i++){
         if(++row[num_row[arr[i]]]==n) return i;
         if(++col[num_col[arr[i]]]==m) return i;
       }
       throw new IllegalArgumentException();
    }
}