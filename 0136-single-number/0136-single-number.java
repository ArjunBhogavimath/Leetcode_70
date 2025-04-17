class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0;i<nums.length;i++){
            xor^=nums[i];
        }
        return xor;
    }
}

/**
do the xor operation whenever we want 1 unique element
if the duplicte elements came, they cancel each other.
so at end the unique element will be remaining in xor variable
 */