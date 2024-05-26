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