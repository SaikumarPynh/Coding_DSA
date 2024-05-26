class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MIN_VALUE;
      for(int i = 0;i< prices.length;i++)  {
        for(int j = i;j<prices.length;j++){
            if(prices[j] - prices[i] > min){
                min = prices[j] - prices[i];
            }
        }
      }
      return min;
    }
}
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// class Solution {
//     public int maxProfit(int[] prices) {
//         int profit = 0;
//         int buyStock = prices[0];
//       for(int i = 1;i< prices.length;i++)  {
//             if(prices[i] < buyStock){
//                 buyStock = prices[i];
//             }
//             profit = Math.max(profit,prices[i]-buyStock);
//       }
//       return profit;
//     }
// }
//class Solution {
//     public int maxProfit(int[] prices) {
//         int min = Integer.MAX_VALUE;
//         int maxprof = 0;
//         for(int i = 0;i < prices.length;i++){
//             maxprof = Math.max(maxprof,prices[i] - min);
//             min = Math.min(min, prices[i]);
//         }




//         return maxprof;
//     }
// }