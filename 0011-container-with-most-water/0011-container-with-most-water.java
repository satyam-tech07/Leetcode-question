class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        // int maxArea =0;
        // for (int i=0;i<n;i++){
        //     for (int j=i+1;j<n;j++){
        //          int widthh=j-i;
        //         if(height[i]<height [j] ) 
        //         int heightoFcOntainer=height[i];
        //         else heightoFcOntainer==height[j];
        //         int area =heightoFcOntainer*
        //     } 
        // }
        int left=0;
        int right=n-1;
        int maxArea=0;
        while(left<=right){
            int  h =Math.min(height[left],height[right]);
            int w=right-left;
            int area =h*w;
            maxArea=Math.max(maxArea,area);
            if(height[left]<height[right]) left ++;
            else right--;
        }
        return maxArea;
    }
}