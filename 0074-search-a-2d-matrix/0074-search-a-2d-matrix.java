class Solution {
    public boolean helper(int[] mat,int target,int low,int high)
    { 
        // if(low<=high)
        // {
        // int mid=(low+high)/2;
        // if(mat[mid]==target) return true;
        // else if(target > mat[mid]) helper(mat,target,mid+1,high);
        // else{
        //     helper(mat,target,low,mid-1);
        // }
        // }
        // return false;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(mat[mid]==target) return true;
            else if(target<mat[mid]) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean result=false;
        for(int i=0;i<n;i++)
        {
            if(matrix[i][0]<=target && target<=matrix[i][m-1]){
                result = helper(matrix[i],target,0,m-1);
            }
        }
        return result;
    }
}