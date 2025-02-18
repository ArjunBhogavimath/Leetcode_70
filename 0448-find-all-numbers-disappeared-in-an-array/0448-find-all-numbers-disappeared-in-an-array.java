class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result_list = new ArrayList<>();

        for(int i =0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }

        for(int i =0;i<nums.length;i++){
            if(nums[i]>0){
                result_list.add(i+1);
            }
        }
        return result_list;


        // Set<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     set.add(num);
        // }

        // List<Integer> list = new ArrayList<>();

        // for(int i =1 ;i <= nums.length;i++){
        //     if(!set.contains(i)){
        //         list.add(i);
        //     }
        // }
        // return list;
    }
}

/**

1. Brute force :
take 2 loops 
check each index from 1 to n and
check if that element exists
otherwise add it to list

TC : O(N2) SC : O(1)


2. BETTER :
added all elemets to set -> o(n) space with o(n) time
now o(n) taversal time to check contains
contains will be done in o(1)

so TC : o(2N) SC : O(N)


3.OPTIMAL :
Using input array
loop through array 
take index as nums[i]-1 (-1 because of index starts with 0) and abs because of negative val
now check if (nums[index] > 0) if yes mark it as negative

and later run a loop again and any items whose value is in posive add it to list
and return list

TC : O(N) SC: O(1)

 */