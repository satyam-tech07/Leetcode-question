class Solution {
    public int smallestIndex(int[] nums) {
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]<10){
    //             if(i==nums[i]) return i;
            
    //     }else{
    //         // if (nums[i]==10 && i==1) return 1;
    //         int sum=0;
    //         int digit=nums[i]%10;
    //         sum=sum+digit;
    //         digit=nums[i]/10;
    //         if(sum==nums[i])  return i;
    //     }
        
    // }
    // return -1;
 for (int i = 0; i < nums.length; i++) {

        int num = nums[i];
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        if (sum == i) {
            return i;
        }
    
 }
    return -1;
}
}