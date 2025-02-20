class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        
        //take 2 pointers to indicate start and end of window
        int left = 0; // initialize as zero
        //other point we can use from for loop

        for(int right =0;right<nums.length;right++){

            //now check if the window is greater than k
            //if yes we will remove nums[left] element
            //which will be the 1st element
            //and increment left by 1
            if(right-left > k){
                set.remove(nums[left]);
                left++;
            }
            if(set.contains(nums[right])){
                return true;
            }
            set.add(nums[right]);
        }
        return false;
    }
}

/**
TC : O(N)
SC : O(K) //ONLY STORING K ELEMENTS IN SET
 */