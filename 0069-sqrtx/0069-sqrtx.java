class Solution {
    public int mySqrt(int x) {
        // long low=0,high=x;
        // while(low<=high){
        //     long mid=(low+high)/2;
        //     if(mid*mid==x)  return (int)mid;
        //     else if(mid*mid>x) high=mid-1;
        //     else{
        //         low=mid+1;
        //     }
        // }
        // return (int)high;
        int s=1;
        int end=x;
        int ans=0;
        while(s<=end){
            int mid=s+(end-s)/2;
            if(x==0 )return 0;
            if(mid == x/mid){
                 return mid;
            }
            if(mid>x/mid){
                end=mid-1;

            }else{
                ans=mid;
                s=mid+1;

            }
        }
        return ans;
    }
}