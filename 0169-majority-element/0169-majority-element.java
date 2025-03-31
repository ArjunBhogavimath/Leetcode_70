class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int majority_element = -1;

        //step 1 : apply moore's voting algo
        for(int i = 0;i<n;i++){
            if(count == 0){
                majority_element = nums[i];
                count = 1;
            }
            else if(majority_element != nums[i]){
                count--;
            }else{
                count++;
            }
        }
        
        //step 2 : verify that majority element appears more than n/2 times
        int counter = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == majority_element){
                counter++;
            }
        }
        if(counter > n/2) return majority_element;
        return -1;
    }
}