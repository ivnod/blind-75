// Find Minimum in Rotated Sorted Array
package com.leetcode.blind75.arrays;

public class Problem8 {
  public static void main(String[] args) {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    Solution solution = new Solution();
    System.out.println(solution.search(nums, 0));
    nums = new int[] {4, 5, 6, 7, 0, 1, 2};
    System.out.println(solution.search(nums, 3));
    nums = new int[] {1};
    System.out.println(solution.search(nums, 0));
  }

  static class Solution {
    public int search(int[] nums, int target) {
      int left = 0, right = nums.length - 1;
      while (left <= right) {
        int mid = (left + (right - left) / 2);
        if (nums[mid] == target) return mid;
        if (nums[left] <= nums[mid]) {
          if (target >= nums[left] && target < nums[mid]) right = mid - 1;
          else left = mid + 1;
        } else {
          if (target > nums[mid] && target <= nums[right]) left = mid + 1;
          else right = mid - 1;
        }
      }
      return -1;
    }
  }
}
