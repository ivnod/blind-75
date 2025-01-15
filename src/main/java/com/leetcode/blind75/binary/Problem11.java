// Sum of Two Integers
package com.leetcode.blind75.binary;

import com.leetcode.blind75.arrays.Problem10;

public class Problem11 {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.getSum(1, 2));
    System.out.println(solution.getSum(3, 2));
    System.out.println(solution.getSum(-1, 2));
    System.out.println(solution.getSum(-11, -13));
    System.out.println(solution.getSum(5, -10));
  }

  static class Solution {
    public int getSum(int a, int b) {
      while (b != 0) {
        int carry = a & b;
        a = a ^ b;
        b = carry << 1;
      }
      return a;
    }
  }
}
