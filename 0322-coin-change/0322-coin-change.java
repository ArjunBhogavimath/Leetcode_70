class Solution {
    public int coinChange(int[] coins, int amount) {
       int dp[] = new int[amount + 1];
       Arrays.fill(dp,-1);
       dp[0] = 0;
       int ans = minCoinRecursion(coins, amount, dp);
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;

    }
    private static int minCoinRecursion(int[] coins, int amount, int dp[]){
         if(amount == 0) return 0;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<coins.length;i++){
            if(amount-coins[i] >= 0){
                int subAns = 0;
                if(dp[amount-coins[i]] != -1){
                    subAns = dp[amount-coins[i]];
                }
                else {
                     subAns = minCoinRecursion(coins, amount-coins[i], dp); //amount - coins[i] will give the remaining amount to compute

                }

                if(subAns != Integer.MAX_VALUE && subAns+1 < ans){
                    ans = subAns+1;
                }
            }
            
        }
        return dp[amount] = ans;
    }
}