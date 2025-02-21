class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int current_sum = 0;
        int minWindowLength = Integer.MAX_VALUE;

        //take 2 pointers to initialize the window
        int high = 0;
        int low = 0;

        while(high<nums.length){

            //add current value to sum and increase the hight
            current_sum += nums[high];
            high++; 

            //goes here only when we reach the sum >= target

            while(current_sum >= target){
                minWindowLength = Math.min(minWindowLength, high-low);

                current_sum -= nums[low]; //remove the 1st elements from sum
                low++;
            }

        }
        return minWindowLength == Integer.MAX_VALUE ? 0 : minWindowLength;
    }
}


/**
it uses both sliding and 2 pointers
1st 2 pointers from  beginning
 run a while loop till high reaches n
 now add the values to total sum
 and increment high++;

 run another while loop inside 
 it will run when sum >= target
 now take the min window length, by substracting high-low
 this variable should be declared as max_value
 take min value of window length

 and now remove the 1st element from window
 that is low++;
 and substarct that sum from array
 that is sum-nums[low]

 TC : 0(N)
 SC : O(1)

 */