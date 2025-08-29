class Solution {
    public void rotate(int[] nums, int k) {
        /**
        3 steps
        reverse the whole array
        and now reverse the 1st k elements
        and after the reverse the k+1 to n-1 elements
         */
        int n = nums.length;

        //to avoid duplicate traversal get modulo of k
        k = k%n; //for handling when k is greater than n

        //reverse the whole array
        reverse(nums, 0,n-1);

        //now reverse the 1st k elements
        reverse(nums, 0, k-1);

        //now reverse the k+1 to n-1
        reverse(nums, k, n-1);
    }

    public void reverse(int nums[], int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}