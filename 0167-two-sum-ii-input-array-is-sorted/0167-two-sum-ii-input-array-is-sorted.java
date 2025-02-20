class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        //take 2 pointer
        int i = 0;
        int j = n-1;

        while(i<j){
            if(numbers[i]+numbers[j] == target){
                return new int[]{i+1,j+1};
            }
            else if(numbers[i]+numbers[j] < target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[] {};
        
    }
}
// 1,2,3,4,5,7 taget - 9

/**
as the array is sorted there is no need of storing elements in hashmap
might consider 2 pointer approach
i from starting
j from ending
in this way we can get the solution
within O(n/2) which roughly equals to TC : O(N) and SC : O(1)
 */