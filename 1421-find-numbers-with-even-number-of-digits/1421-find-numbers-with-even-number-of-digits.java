class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int result = 0;
    
        for(int i =0;i<n;i++){
             int temp = 0;
            while(nums[i] > 0){
                temp++;
                nums[i] = nums[i]/10;
            }
            if(temp%2 == 0) result++;
        }
        return result;
    }
}