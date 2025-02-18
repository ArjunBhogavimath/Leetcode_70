class Solution {
    public int missingNumber(int[] nums) {
        //get the summation
        int n = nums.length;
        int summation = n*(n+1)/2;
        int arr_sum = 0;
        for(int num : nums){
            arr_sum+=num;
        }
        return summation-arr_sum;
    }
}