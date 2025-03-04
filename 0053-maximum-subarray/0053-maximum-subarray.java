class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            //add nums[i] to sum
            sum += nums[i];
            ans = Math.max(sum,ans); 
            //now check if sum is less than 0.
            //if yes then we dont need to consider that part so make sum as 0
            if(sum<0) sum=0;
        }
        return ans;
    }
}

/**
This is Kadane's algorithm
we will have 2 fields 
int ans (which willl store max value)
int sum (which will store current sum)

run a for loop from i ->n
will add nums[i] to sum
now assign max of sum and ans to ans;
now check if sum is less than 0,
if yes, we dont need that, so make sum as 0
TC : O(n)
SC : O(1)
 */
