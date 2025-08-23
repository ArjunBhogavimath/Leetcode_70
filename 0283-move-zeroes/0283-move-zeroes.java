class Solution {
    public void moveZeroes(int[] nums) {
        int writePos = 0;

        for(int readPos = 0 ; readPos < nums.length ; readPos++){
            if(nums[readPos] != 0){
                nums[writePos++] = nums[readPos];
            }
        }

        while(writePos < nums.length){
            nums[writePos++] = 0;
        }
    }
}