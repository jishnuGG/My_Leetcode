class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        boolean flag=true;
       
        int temp=0;
        int i=0;
        while(temp<n)
        {
            //col wise
            int t=1;
           
            int[] arr=new int[n+1];
            for(int j=0;j<n;j++)
            {
                if(arr[matrix[j][i]]!=0)
                {
                    return false;
                }
                arr[matrix[j][i]]++;
            }
            //row wise 
            int[] arr1=new int[n+1];
            for(int j=0;j<n;j++)
            {
                if(arr1[matrix[i][j]]!=0)
                {
                    return false;
                }
                arr1[matrix[i][j]]++;
            }
            i++;
            temp++;
        }
       return flag;
    }
}