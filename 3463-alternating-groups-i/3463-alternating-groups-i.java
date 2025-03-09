class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count=0;
        int n=colors.length;
        int[] arr=new int[n*2];
        for(int i=0;i<n;i++)
        {
            arr[i]=colors[i];
        }
        int k=0;
        for(int j=n;j<n*2 && k<n;j++)
        {
            arr[j]=colors[k];
            k++;
        }
        for(int i=1;i+1<n+2;i++)
        {
            if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1])
            count++;
        }
        return count;
    }
}