class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for (int num : arr) {
            ans.put(num, ans.getOrDefault(num, 0) + 1);
        }
        int max = -1;
         for (int key : ans.keySet()) {
            if (ans.get(key) == key){
                 max = Math.max(max, key);
            }

            }
        return max;
    }
}