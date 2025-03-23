class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        int first = 0;
        int second = 1;
        int result = 0;
        int counter = 1;

        while(first < second && second <n){
            if(nums[first] < nums[second]){
                counter++;
            } else{
                counter = 1;
            }
            result = Math.max(result,counter);
            first++;
            second++;
        }
        return result;
        
    }
}

/**
first thing is 2 pointers
 */