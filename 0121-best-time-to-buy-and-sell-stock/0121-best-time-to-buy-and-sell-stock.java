class Solution {
    public int maxProfit(int[] prices) {
       int profit = 0;
       int min_buy = prices[0]; //lets consider as 1st day for initialization

       //run a loop from 1 to n (as min_buy is already assigned with a[0])
       for(int i=1;i<prices.length;i++){
        int cost = prices[i] - min_buy; // get the difference between current and last smaller number
        profit = Math.max(cost, profit); //this will filter out the maximum profit
        //now comes the dp part
        // i e remembering past
        min_buy = Math.min(prices[i],min_buy);
       }
       return profit;
    }
}

/*
Using DP:
1st i need to get the minimum price
for this we can start assignig it as prices[0]
and start a loop from 1 to n
now substarct i with mini and store as temp profit
now compare the temp profit with profit and store max value,
and now compare min_price with prices[i] and store the minimum

TC : O(N)
SC : O(1)

*/