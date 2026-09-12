class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int orig=x;
    int reverse=0;
    while(x!=0){
        int num=x%10;
        reverse=reverse*10+num;
        x=x/10;
    }
    // if(orig==reverse) return true;


     return orig==reverse;   
    }
}