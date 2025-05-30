class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        if(n < 2) return n;
        int left = 0;
        int right = n-1;

        while(left < right && s.charAt(left) == s.charAt(right)){
            char c = s.charAt(left);
            while( left<=right && s.charAt(left) == c){
                left++;
            }
            while(left<=right && s.charAt(right) == c){
                right--;
            }
          
        }
        return right-left+1;
    }
}