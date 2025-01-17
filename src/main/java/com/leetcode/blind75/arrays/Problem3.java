// Contains Duplicate
package com.leetcode.blind75.arrays;

import java.util.HashSet;

public class Problem3 {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 1};
    Solution solution = new Solution();
    System.out.println(solution.containsDuplicate(nums));
    nums = new int[] {1, 2, 3, 4};
    System.out.println(solution.containsDuplicate(nums));
    nums = new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    System.out.println(solution.containsDuplicate(nums));
  }

  static class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> visitedNumbers = new HashSet<>();
      for (int i = 0; i < nums.length; i++) {
        if (visitedNumbers.contains(nums[i])) return true;
        else visitedNumbers.add(nums[i]);
      }
      return false;
    }
  }
}
