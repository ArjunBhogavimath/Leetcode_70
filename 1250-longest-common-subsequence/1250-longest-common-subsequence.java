class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int dp[][] = new int[m+1][n+1];


        //in the dp we should fill the 1st row and column with 0
        //bug we can ignore this
        // for(int i = 0;i<m;i++){
        //     dp[i][0] = 0;
        // }
        // for(int i = 0;i<n;i++){
        //     dp[0][i] = 0;
        // }

        /**
        now run a for loops and start comparing,
        and if matches add 1 with previous diagonal element
        if not match then choose max of the either previous row or previous column
        at last return the last index of the dp matrix
         */
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                } 
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        //return last value (which will be maximum)
        return dp[m][n];
    }







    //This is for top down approach of DP

    public int longestCommonSubsequenceForTopDown(String text1, String text2) {
        //create a memoization matrix to store the values
        int dp[][] = new int[text1.length()][text2.length()];
        //fill them with -1
        for(int row[] : dp){
            Arrays.fill(row, -1);
        }
        //now call the recursion method
        return lcsRecursionMemoization(text1, text2, 0, 0, dp);
    }
    private int lcsRecursionMemoization(String text1, String text2, int i, int j, int dp[][]){
        //check if we are moving out of string lengths and return
        if(i >= text1.length()  || j >= text2.length()) return 0;

        //now check if the current element already there in the matrix
        if(dp[i][j] != -1) return dp[i][j];

        //if matching then store that in dp and increment and call the sub problems
        if(text1.charAt(i) == text2.charAt(j)){
            dp[i][j] = 1 + lcsRecursionMemoization(text1, text2, i+1,j+1, dp);
        } 
        //IN The else part we are storing max of left or right in dp matrix
        else{
            dp[i][j] = Math.max(lcsRecursionMemoization(text1, text2, i+1,j,dp), 
                                lcsRecursionMemoization(text1, text2, i,j+1, dp));
        }

        //at last return the dp of current
        return dp[i][j];
    }
}

/**

for plain recursion i have added memoization 

 */