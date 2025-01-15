// Best Time to Buy and Sell Stock
package com.leetcode.blind75.arrays;

public class Problem2 {
  public static void main(String[] args) {
    int[] prices = {7, 1, 5, 3, 6, 4};
    Solution solution = new Solution();
    System.out.println(solution.maxProfit(prices));
    prices = new int[] {7, 6, 4, 3, 1};
    System.out.println(solution.maxProfit(prices));
  }

  static class Solution {
    public int maxProfit(int[] prices) {
      int profit = 0, minPrice = prices[0];
      for (int i = 1; i < prices.length; i++) {
        int currPrice = prices[i];
        profit = Math.max(profit, currPrice - minPrice);
        minPrice = Math.min(minPrice, currPrice);
      }
      return profit;
    }
  }
}
