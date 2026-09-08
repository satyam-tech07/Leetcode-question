class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int startingrow=0;
        int endingcol=m-1;
        int endingrow=n-1;
        int startcol=0;
        while(startingrow<=endingrow &&startcol<=endingcol){
            for(int i=startcol;i<=endingcol;i++){
                ans.add(matrix[startingrow][i]);
            }
            startingrow++;
            for(int j=startingrow;j<=endingrow;j++){
                ans.add(matrix[j][endingcol]);
            }
            endingcol--;
            if(startingrow<=endingrow ){
            for(int k=endingcol;k>=startcol;k--){
                ans.add(matrix[endingrow][k]);
            }
            }
            endingrow--;
            if(startcol<=endingcol){
            for(int y=endingrow;y>=startingrow;y--){
                ans.add(matrix[y][startcol]);
            }
            }
            startcol++;



        }
        return ans;

    }
}