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

2. Better solution : Using hashmap
cretae a temp array and copy nums array to that
sort the array O(nlogn)
now check if element is existed in map if not add the element to map with index as value
ignore if the element is already exists
now create new array with n elemets
now loop through n times
with ans[i] = map.get(nums[i])
basically this will get the value of the current num element 
which will be a index and which will basically the elements smaller than the present element

TC : O(NlogN) + O(N) = O(NlogN)
sc : O(N)
 */