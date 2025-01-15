// 3Sum
package com.leetcode.blind75;

public class Problem10 {
  public static void main(String[] args) {
    int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    Solution solution = new Solution();
    System.out.println(solution.maxArea(heights));
    heights = new int[] {1, 1};
    System.out.println(solution.maxArea(heights));
  }

  static class Solution {
    public int maxArea(int[] heights) {
      int left = 0;
      int right = heights.length - 1;
      int ans = 0;
      while (left < right) {
        int min = Math.min(heights[left], heights[right]);
        ans = Math.max(ans, min * (right - left));
        if (heights[left] < heights[right]) left++;
        else right--;
      }

      return ans;
    }
  }
}
