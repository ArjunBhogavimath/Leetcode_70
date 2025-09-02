class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int dp[][] = new int[n][n];

        for(int row[] : dp){
            Arrays.fill(row,-1);
        }
        
        String s2 = new StringBuilder(s).reverse().toString();

        return longestCommonSubseqRecur(s, s2, 0, 0, dp);
    }

    private int longestCommonSubseqRecur(String s1, String s2, int i, int j, int dp[][]){
        if(i >= s1.length() || j >= s2.length()) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] = 1 + longestCommonSubseqRecur(s1, s2, i+1, j+1, dp);
        }

        else {
            dp[i][j] = Math.max(longestCommonSubseqRecur(s1, s2, i+1,j,dp),
                                longestCommonSubseqRecur(s1, s2, i, j+1, dp));
        }

        return dp[i][j];
    }
}