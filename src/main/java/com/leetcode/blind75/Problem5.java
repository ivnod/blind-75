// Maximum Subarray
package com.leetcode.blind75;

public class Problem5 {
  public static void main(String[] args) {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    Solution solution = new Solution();
    System.out.println(solution.maxSubArray(nums));
    nums = new int[] {1};
    System.out.println(solution.maxSubArray(nums));
    nums = new int[] {5, 4, -1, 7, 8};
    System.out.println(solution.maxSubArray(nums));
  }

  static class Solution {
    public int maxSubArray(int[] nums) {
      int curr_sum = nums[0];
      int max_sum = nums[0];
      for (int i = 1; i < nums.length; i++) {
        curr_sum = Math.max(curr_sum + nums[i], nums[i]);
        max_sum = Math.max(max_sum, curr_sum);
      }
      return max_sum;
    }
  }
}
