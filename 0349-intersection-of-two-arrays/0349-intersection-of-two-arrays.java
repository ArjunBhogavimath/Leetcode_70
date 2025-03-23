class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num1Set = new HashSet<>();

        for(int num : nums1){
            num1Set.add(num);
        }

        Set<Integer> resultSet = new HashSet<>();

        for(int i = 0;i<nums2.length;i++){
            if(num1Set.contains(nums2[i])){
                resultSet.add(nums2[i]);
            }
        }

        //convert result set to an array
        int result[] =  new int[resultSet.size()];
        int i =0;
        for(int num : resultSet){
            result[i++] =  num;
        }
        return result;
    }
}

/**
store num1 array in set
now go through the second array and check for match in set
and store matches in another result set

 */