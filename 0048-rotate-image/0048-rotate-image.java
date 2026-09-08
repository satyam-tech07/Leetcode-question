class Solution {
    public void rotate(int[][] matrix) {
        for (int i=0;i<matrix.length;i++){
            for (int j=i+1;j<matrix[0].length;j++){
                int value=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=value;
            }
        }
        for (int i=0;i<matrix.length;i++){
            int startcol=0;
            int endcol=matrix.length-1;
            while(startcol<=endcol){
                int temp=matrix[i][startcol];
                matrix[i][startcol]=matrix[i][endcol];
                matrix[i][endcol]=temp;
                startcol++;
                endcol--;


            }
        }
    }
}