class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        //create a memoization matrix to store the values
        int dp[][] = new int[text1.length()][text2.length()];
        //fill them with -1
        for(int row[] : dp){
            Arrays.fill(row, -1);
        }
        //now call the recursion method
        return lcsRecursion(text1, text2, 0, 0, dp);
    }
    private int lcsRecursion(String text1, String text2, int i, int j, int dp[][]){
        //check if we are moving out of string lengths and return
        if(i >= text1.length()  || j >= text2.length()) return 0;

        //now check if the current element already there in the matrix
        if(dp[i][j] != -1) return dp[i][j];

        //if matching then store that in dp and increment and call the sub problems
        if(text1.charAt(i) == text2.charAt(j)){
            dp[i][j] = 1 + lcsRecursion(text1, text2, i+1,j+1, dp);
        } 
        //IN The else part we are storing max of left or right in dp matrix
        else{
            dp[i][j] = Math.max(lcsRecursion(text1, text2, i+1,j,dp), 
                                lcsRecursion(text1, text2, i,j+1, dp));
        }

        //at last return the dp of current
        return dp[i][j];
    }
}

/**

for plain recursion i have added memoization 

 */