class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        int longest = 0;

         for (int num : numSet) {
            // Only start counting if it's the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longest = Math.max(longest, currentStreak);
            }
         }

        return longest;
    }

}

/**
1.Brute force
Take 1 element and compare next element of that array is present or not
if it is there start counter 
when it stops leave. and goto next number
and check from there



3. Optimal solution :
Using Hashset : store all elements in set
now iterate 
check if current element-1 is present in the set
if yes then just move (in this we avoid doing unnessesery steps)
else -> then do the counting until there is next element
and now store the max of longest consecutive

 */