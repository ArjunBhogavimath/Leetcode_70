class Solution {
    public String longestPalindrome(String s) {
        //edge case empty string
        if(s == null || s.length() < 1) return "";

        String result = "";

        for(int i= 0;i<s.length();i++){
            
            /**
            There is 2 scenarios 1 is even length and 2nd one is odd length
            the odd length will have only 1 centre
            but even length palindrome will have 2 centres
             */

            //odd
            String oddPalindrome = expandAroundCentre(s, i, i);

            //even
            String evenPalindrome = expandAroundCentre(s, i, i+1);

            if(oddPalindrome.length() > result.length()){
                result = oddPalindrome;
            }
            if(evenPalindrome.length() > result.length()){
                result = evenPalindrome;
            }
        }
        return result;

    }

    public String expandAroundCentre(String s, int left, int right){

        /**
        The while will run only 
        when left reaches 0
        and right reached end of string 
        and it allowed only when left and right character or same (handles for even length at beginning)
        after that it will make sure that both left and right are same characters 
         */

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}