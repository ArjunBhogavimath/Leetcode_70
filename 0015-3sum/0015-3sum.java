class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /**
        WE WILL USE 2 POINTERS AND SORTING */

        if(nums == null || nums.length < 3) return new ArrayList<>();

        int n = nums.length;
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();

        //now will divide the problem into  pointer by keeping i as constant in for loop
        for(int i=0;i<n-2;i++){
            //2 pointer 
            int left = i+1;
            int right = n-1;
            
            //now run while loop for 2 pointers
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
         return new ArrayList<>(result);
    }
}

/**
1.Brute force 
run 3 nested loops 1st will start from 0 
and 2nd loop will start from i+1, and 3rd will be from j+1
if the sum of all arr[i+j+k] == 0
then sort them 1st (to avoid duplication)
and to put only unique elements store it in set
TC : O(N3) SC: 2 O(TRIPLETS)

2. Better solution:
take 2 for loops
and a map for 3rd element
and use set for storing unique elements

TC: O(N^2) + O(logn) SC : O(N) + O(M)

3. Optimal solution:
using 2 pointers and sorting 
first sort array
run 1 for loop from 0->n
with i variable
now inside that take 2 pointers
j and k  where j = i+1 and k = n-1
and check if(previous element is same as this at that time continue) only applies for i>0
now run a while loop where j<k
it will have 3 cases
sum > 0, <0, == 0.
for >0 -> k-;
for <0 -> j++;
if equals => i'll add it to a list
and later do j++ and k--;
but remeber there is still a chances of j == j-1 and same for k
for this run a while loop till j != j-1. and same for k
but it can get index out of bound so
add j<k validation.

TC : NLOGN -> SORTING + O(N(for loop) * N(inner while loop)) = Nlogn+N^2
SC : O(no of unique triplets)

 */


  // int n = nums.length;
        // Set<List<Integer>> set = new HashSet<>(); //need set of list to avoid duplicate lists
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i] + nums[j] + nums[k] == 0){
        //                 //need to create new temporary list to store each element
        //                 List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 temp.sort(null);
        //                 set.add(temp);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<>(set);
        // return ans;