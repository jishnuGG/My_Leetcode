class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int len=original.length;
        int[][] result=new int[m][n];
        if(m*n!=len)
        {
           return new int[][] {};
        }
        for(int i=0;i<len;i++){
            result[i/n][i%n]=original[i];
        }
        return result;
    }
}