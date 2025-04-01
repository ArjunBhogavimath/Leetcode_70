class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int element1 = 0;
        int element2 = 0;
        int count1 = 0;
        int count2 = 0;

        //step 1: apply Moore's voting algo
        for(int num : nums){
            if(count1 == 0 && num != element2){
                element1 = num;
                count1 = 1;
            }
            else if(count2 == 0 && num != element1){
                element2 = num;
                count2 = 1;
            }
            else if(element1 == num){
                count1++;
            }
            else if(element2 == num){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        //step 2: verify majority elements are greater than n/3
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == element1) count1++;
            else if(num == element2) count2++;
        }
        List<Integer> result = new ArrayList<>();
        if(count1 > n/3) result.add(element1);
        if(count2 > n/3) result.add(element2);

        return result;
    }
}

/**
follows the same Moore's voting algorithm
but for n/3 there can be at max 2 elements can come
so we can follow the same procedure but for this we can 2 elements
and check for each individually
 */