class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp[] = new int[nums.length];
        int i = 0;
        int j = nums.length-1;

        for(int k = nums.length-1;k>=0;k--){
            if(Math.abs(nums[i]) < Math.abs(nums[j])){
                temp[k] = nums[j] * nums[j];
                j--;  
            } else{
                temp[k] = nums[i] * nums[i];
                i++;
            }
        }
        return temp;
    }
}

/**
create new array of size n
take 2 pointers in nums
1 at starting and 1 at end
now compare both numbers 
the greated number shuld be placed at last
else put i*i there
TC : O(N), SC : O(N)
 */