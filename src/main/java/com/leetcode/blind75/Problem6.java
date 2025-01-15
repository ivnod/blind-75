// Maximum Product Subarray
package com.leetcode.blind75;

public class Problem6 {
  public static void main(String[] args) {
    int[] nums = {2, 3, -2, 4};
    Solution solution = new Solution();
    System.out.println(solution.maxProduct(nums));
    nums = new int[] {-2, 0, -1};
    System.out.println(solution.maxProduct(nums));
    nums = new int[] {5, 4, -1, 7, 8};
    System.out.println(solution.maxProduct(nums));
  }

  static class Solution {
    public int maxProduct(int[] nums) {
      int min = 1, max = 1, ans = nums[0];
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
          min = 1;
          max = 1;
          ans = Math.max(ans, nums[i]);
        } else {
          int tmp = min;
          min = Math.min(nums[i], Math.min(nums[i] * min, nums[i] * max));
          max = Math.max(nums[i], Math.max(nums[i] * tmp, nums[i] * max));
          ans = Math.max(ans, max);
        }
      }
      return ans;
    }
  }
}
