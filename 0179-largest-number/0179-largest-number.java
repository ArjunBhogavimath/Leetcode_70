class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        //convert int to string
        //step 1: 
        String[] strNums = new String[n];
        for(int i=0;i<n;i++){
            strNums[i] = String.valueOf(nums[i]);
        }

        //step 2:
        //sort using custom comparator
        Arrays.sort(strNums, (a,b) -> (b+a).compareTo(a+b));

        // Step 3: Edge case: If the largest number is "0", return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        //step 4:
        //Now with the sorted array construct a string
        StringBuilder ans = new StringBuilder();
        for(String str : strNums){
            ans.append(str);
        }
        return ans.toString();
    }
}

/**
we should use custom comparator for sorting strings a,b

Sorting Process:
Compare "3" and "30"

"330" vs "303"

"330" is bigger, so "3" comes first.

Compare "30" and "34"

"3430" vs "3034"

"3430" is bigger, so "34" comes first.

Compare "34" and "5"

"534" vs "345"

"534" is bigger, so "5" comes first.

Compare "5" and "9"

"95" vs "59"

"95" is bigger, so "9" comes first.

 */