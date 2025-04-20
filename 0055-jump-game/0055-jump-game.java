class Solution {
    public boolean canJump(int[] nums) {
        int max_index = 0;
        int n = nums.length;
        
        for(int i =0;i<n; i++){
            if(i > max_index) return false;
            max_index = Math.max(i + nums[i], max_index);
            //if(max_index >= n-1) return true;
        }
        return true;
    }
}

/**
i can create a max find index var and 
we can check till where we can reach, 
in any case we find that i > max_find_index return false
otherwise if max_find_index >= n-1, return true;
 */