class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int single_num = 0;
        for(int i =0;i<n;i++){
            single_num ^= nums[i];
        }
        return single_num;
    }
}