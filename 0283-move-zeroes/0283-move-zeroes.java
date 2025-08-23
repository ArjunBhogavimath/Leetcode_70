class Solution {
    public void moveZeroes(int[] nums) {
        int writePos = 0;
        //on 1st traverse write non zero elements to array
        //after that in 2nd traversal add zero's to the remaining places
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