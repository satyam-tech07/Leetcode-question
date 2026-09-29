class Solution {
    public int[] plusOne(int[] digits) {
    //     // int[] ans=new int[digits.length];
    //     int ans[]=digits.clone();
    //     // for(int i=0;i<ans.length;i++){
    //    if( ans[ans.length-1]<10){
    //      ans[ans.length-1]= ans[ans.length-1]+1;
    //   }
    //  else{
    //     ans[ans.length-1]=1;
    //      ans[ans.length]=0;
        

    //     }
    //     return ans;
      for (int i = digits.length - 1; i >= 0; i--) {

        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }

        digits[i] = 0;
    }

    int[] ans = new int[digits.length + 1];
    ans[0] = 1;

    return ans;
        
    }
}