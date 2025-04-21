class Solution {
    public int fib(int n) {
        // if(n <= 1) return n;
        // return fib(n-1) + fib(n-2);

        //with dp array
        if(n < 2) return n;
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] =  dp[i-1] + dp[i-2];
        }
        return dp[n];

        //without extra space
        //if(n < 2) return n;
        // int prev2 = 0;
        // int prev = 1;

        // for(int i=3;i<=n;i++){
        //     int curr = prev + prev2;
        //     prev2 = prev;
        //     prev = curr;
        // }
        // return  prev;
    }
}
