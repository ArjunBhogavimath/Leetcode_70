class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 0; //pointing towards unique elements 
        for(int right = 1;right<n;right++){
            if(nums[left] != nums[right]){
                nums[++left] = nums[right];
            }
        }
        return left+1;
    }
}

/**
2 pointers:
1 will be always pointing towards unique elements from left
another pointer will be checking next greater element
whenever there is a next greater element I'll copy it to 1st pointer's next place

once the second pointer reaches end,
i'll exit the loop
and now from the next element from 1st pointer make them as -1
 */