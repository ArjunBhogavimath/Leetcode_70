class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 1;
        
        while(left<right && right<n){
            if(nums[left] == nums[right]){
                right++;
            }
            else {
                nums[++left] = nums[right];
                right++;
            }
        }
        System.out.println(left);
        return left+1;
    }
}