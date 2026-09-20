class Solution {
    public int reverseDegree(String s) {
        int sum=0;
       
         for(int i=0;i<s.length();i++){
            int product ='z' - s.charAt(i) +1;//formula of reverse index
            int position=i+1;
            sum+=position*product;

        }
        return sum;
        
    }
    }