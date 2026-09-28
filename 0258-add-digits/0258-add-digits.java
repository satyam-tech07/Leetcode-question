class Solution {
    public int addDigits(int num) {
    //     if(num ==0) return 0;
    //     int sum=0;
    //     while(num>0){
    //         int digit=num%10;
    //         sum=sum+digit;
    //         num=num/10;
    //     }
    //     int ans =0;
    //     while(sum>0){
    //         int g=sum%10;
    //         ans=ans+g;
    //         sum=sum/10;
    //     }

    //   return ans; 
      while (num >= 10) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        num = sum;
    }

    return num; 
    }
}