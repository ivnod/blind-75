// 1. Two Sum
package com.leetcode.blind75.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem1 {
  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    Solution solution = new Solution();
    System.out.println(solution.twoSum(nums, target));
    nums = new int[] {3, 2, 4};
    target = 6;
    System.out.println(solution.twoSum(nums, target));
    nums = new int[] {3, 3};
    target = 6;
    System.out.println(solution.twoSum(nums, target));
  }

  static class Solution {
    public List<Integer> twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> map = new HashMap<>();
      List<Integer> indicesList = new ArrayList<>();
      for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
          indicesList.add(i);
          indicesList.add(map.get(target - nums[i]));
        } else {
          map.put(nums[i], i);
        }
      }
      return indicesList;
    }
  }
}
