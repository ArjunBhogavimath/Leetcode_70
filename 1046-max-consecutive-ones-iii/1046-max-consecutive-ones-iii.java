class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int zeroCount = 0;
        int n = nums.length;

        //apply 2  pointer and sliding window
        while(right<n){
            //check if the current element in right is zero if yes increase 0
            if(nums[right] == 0){
                zeroCount++;
            }

            //if at 1 place zerocount crosses k
            //then move the left till it comes below the k
            while(zeroCount > k){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }

            //get the current length
            int len = right - left + 1;
            maxLength = Math.max(len, maxLength);

            //now at last move the right pointer
            right++;
        }
        return maxLength;
    }
}