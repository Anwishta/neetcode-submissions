class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int idx = 0;
        for(int i = 0; i < ans.length; i++){
            if(i == nums.length){
                idx = 0;
            }
            ans[i] = nums[idx];
            idx++;
        }
        return ans;
    }
}