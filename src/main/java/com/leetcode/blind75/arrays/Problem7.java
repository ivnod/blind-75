// Find Minimum in Rotated Sorted Array
package com.leetcode.blind75.arrays;

public class Problem7 {
  public static void main(String[] args) {
    int[] nums = {3, 4, 5, 1, 2};
    Solution solution = new Solution();
    System.out.println(solution.findMin(nums));
    nums = new int[] {4, 5, 6, 7, 0, 1, 2};
    System.out.println(solution.findMin(nums));
    nums = new int[] {11, 13, 15, 17};
    System.out.println(solution.findMin(nums));
  }

  static class Solution {
    public int findMin(int[] nums) {
      if (nums.length == 1) return nums[0];
      if (nums.length == 2) return Math.min(nums[0], nums[1]);
      if (nums[0] < nums[nums.length - 1]) return nums[0];
      while (true) {
        int left = 0, right = nums.length - 1;
        int mid = (left + (right - left) / 2);
        // check mid+1 is decreasing
        if (nums[mid + 1] < nums[mid]) return nums[mid + 1];
        // check mid is decreasing
        if (nums[mid] < nums[mid - 1]) return nums[mid];
        // discard sorted part
        if (nums[left] < nums[mid]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
  }
}
