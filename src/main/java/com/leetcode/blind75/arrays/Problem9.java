// 3Sum
package com.leetcode.blind75.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem9 {
  public static void main(String[] args) {
    int[] nums = {-1, 0, 1, 2, -1, -4};
    Solution solution = new Solution();
    System.out.println(solution.threeSum(nums));
    nums = new int[] {0, 1, 1};
    System.out.println(solution.threeSum(nums));
    nums = new int[] {0, 0, 0};
    System.out.println(solution.threeSum(nums));
  }

  static class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> triplets = new ArrayList<>();
      Arrays.sort(nums);
      for (int i = 0; i <= nums.length - 3; i++) {
        if (i == 0 || nums[i] != nums[i - 1]) {
          int left = i + 1;
          int right = nums.length - 1;
          int target = -nums[i];
          while (left < right) {
            if (nums[left] + nums[right] == target) {
              List<Integer> triplet = new ArrayList<>();
              triplet.add(nums[i]);
              triplet.add(nums[left]);
              triplet.add(nums[right]);
              triplets.add(triplet);
              while (left < nums.length - 1 && nums[left] == nums[left + 1]) left++;
              while (right > 0 && nums[right] == nums[right - 1]) right--;
              left++;
              right--;
            } else if (nums[left] + nums[right] < target) {
              left++;
            } else {
              right--;
            }
          }
        }
      }

      return triplets;
    }
  }
}
