// Number of 1 Bits
package com.leetcode.blind75.binary;

public class Problem12 {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.hammingWeight(11));
    System.out.println(solution.hammingWeight(128));
    System.out.println(solution.hammingWeight(12));
    System.out.println(solution.hammingWeight(16));
  }

  static class Solution {
    public int hammingWeight(int n) {
      int count = 0;
      while (n != 0) {
        if ((n & 1) != 0) count++;
        n = n >> 1;
      }
      return count;
    }
  }
}
