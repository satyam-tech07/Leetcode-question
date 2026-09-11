class Solution {
    public boolean isPerfectSquare(int num) {
        
        int s=1; 
        int end =num;
        // int ans=-1;
        while(s<=end){
            int mid =s+(end-s)/2;
            if(mid== num/mid &&num%mid==0) return true;
            if(mid> num/mid){
                end=mid-1;

            }else {
                s=mid+1;
            }
        
         
         }
         return false;

    }
}