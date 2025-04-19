class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int n = s.length();
        int left = 0;
        int right = n-1;
        while(left<=right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/**
step 1: trim down white space and extra special characters and numbers
and make everything to lowercase
then take 2 pointers 1 at start and 1 at end, and start comparing
 */