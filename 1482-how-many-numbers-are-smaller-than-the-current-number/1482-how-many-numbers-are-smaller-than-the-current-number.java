class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = nums[i];
        }
        Arrays.sort(temp);

        

        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i] , i);
            }
        }

        int result_arr[] = new int[n];
        for(int i =0;i<n;i++){
            result_arr[i] = map.get(nums[i]);
        }

        return result_arr;




        //Burte force
        // int n = nums.length;
        // int ans_arr[] = new int[n];
        // for(int i =0;i<n;i++){
        //     int count = 0;
        //     for(int j =0;j<n;j++){
        //         if(i != j && nums[j] < nums[i]){
        //             count++;
        //         }
        //     }
        //     ans_arr[i] = count;
        // }
        // return ans_arr;
    }
}

/**

1.Brute force : using 2 loops
create new ans arr with same lenght
now run 2 loops 
and inside inner loop
add a condition that ignores when i == j and nums[i] > nums[j]
and increments counter when passed.
now we have number of smaller elements count
we will add that counter to ith position of ans array

TC : O(N^2) SC: O(1) as the ans array is response
 */