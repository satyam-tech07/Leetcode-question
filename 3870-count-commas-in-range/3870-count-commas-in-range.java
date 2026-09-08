class Solution {
    public int countCommas(int n) {
    //     int count =0;
    //     while(n!=0){
    //         n=n/10;
    //         count++;
    //     }
    //     if (count<=3) return 0;
    // int commas=count/4;
    //     return commas;
    if (n < 1000) {
        return 0;
    }

    return n - 1000 + 1;
    }
}