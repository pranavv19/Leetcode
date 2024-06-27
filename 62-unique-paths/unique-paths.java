class Solution {
    int cnt(int i,int j,int m,int n, int[][] arr)
    {
        if(i==m-1&&j==n-1)
        return 1;
        if(i>=m||j>=n)
        return 0;
        if(arr[i][j]!=-1)
        return arr[i][j];
        return arr[i][j]=cnt(i+1,j,m,n,arr)+cnt(i,j+1,m,n,arr);

    }
    public int uniquePaths(int m, int n)
    {
       int[][] arr = new int[m][n];
       for (int i = 0; i < m; i++) 
       {
        Arrays.fill(arr[i], -1);
        }
    
    return cnt(0, 0, m, n, arr);
        
    }
}