class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        int x=n;
        int y=m;
        int [][] ans=new int [x][y];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int value =matrix[i][j];
                ans[j][i]=value;

            }
        }
        return ans;
        
    }
}