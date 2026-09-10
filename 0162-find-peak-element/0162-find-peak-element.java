class Solution {
    public int findPeakElement(int[] nums) {
//         int n=nums.length;
//         int s=0;
//         int e=n-1;
//          int ans =-1;
//          if (n<2) return 0;
//         while (s<=e){
//             int mid=s+(e-s)/2;
//             // if(nums.length==mid) return mid;
//             if(nums[mid]<nums[mid+1]){
//                s=mid+1;
//             }else{
//                 //
//             //   e=mid;
//             ans =mid;
//             e=mid-1;
//             }
//         }
//         return ans;
        
//     }
// }
int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] < nums[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        return s;
    }
}