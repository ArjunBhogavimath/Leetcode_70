class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;

        while(left<=right){
            if(nums[left]%2 == 0){
                left++;
            }
            else{
                swap(nums,left,right);
                right--;
            }
        }
        return nums;
    }
    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}