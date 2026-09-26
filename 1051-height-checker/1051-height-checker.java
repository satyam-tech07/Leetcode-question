class Solution {
    public int heightChecker(int[] heights) {
      
int[] arr = heights.clone();
Arrays.sort(arr);
        int count =0;
        int i=0;
        while(i<heights.length){
            if(heights[i]!=arr[i]){
                count++;
            }
            i++;
            // j++;
        }

        return count;
    }
}