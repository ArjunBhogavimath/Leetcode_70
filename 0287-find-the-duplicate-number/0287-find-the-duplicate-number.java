class Solution {
    public int findDuplicate(int[] nums) {
       int slow = nums[0];
       int fast = nums[0];

       do{
        slow = nums[slow];
        fast = nums[nums[fast]];
       } while(slow != fast);
        //now they met at 1 place

        //so move 1 pointer to start and start going 1 by 1
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

    }
}
/**
1. Better approach : using hashset
2. Best approach : Using tortoise and hare algorithm

 */