class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>  map = new HashMap<>();

        int compliment = 0;

        for(int i = 0;i<nums.length;i++){
            compliment = target -nums[i];

            if(map.containsKey(compliment)){
                return new int[] {i,map.get(compliment)};
            }
            map.put(nums[i],i);
        }

        return null;

        // Map<Integer, Integer> map = new HashMap<>();
        // int compliment = 0;

        // for(int i=0;i<nums.length;i++){
        //     compliment = target-nums[i];
        //     if(map.containsKey(compliment)){
        //         return new int[] {i,map.get(compliment)};
        //     }
        //     map.put(nums[i],i);
        // }
        // return null;
    }
}

/**
1. Brute force : 
I can run 2 for loops and compare each elememts
TC : O(n2) SC: O(1)

2.Using Hashmap :
store each element along with its index
now compare each element check if target-arr[i] = ans
and compare ans is there in hashmap,
if there return or add current element.
TC: O(N) SC:O(N)

3.Using 2 pointers:
sort the array, and 1 point starts at first and another 1 at last
and compare each element so if the sum is lesser the start pointer will move
if the sum is greater , the end pointer will move 
(but for this problem we need to create new data structures to store key and value
, so not doing it)
TC: O(N*NlogN), SC : O(1)
 */