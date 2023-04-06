package kyu7.sum_of_cubes;

/**
 * Java 17
 * <p>
 * Write a function that takes a positive integer n, sums all the cubed values from 1 to n
 * (inclusive), and returns that sum.
 * <p>
 * Assume that the input n will always be a positive integer.
 * <p>
 * Examples: (Input --> output)
 * <p>
 * 2 --> 9 (sum of the cubes of 1 and 2 is 1 + 8)
 * <p>
 * 3 --> 36 (sum of the cubes of 1, 2, and 3 is 1 + 8 + 27)
 */

public class Solution {

  public static long sumCubes(long n) {
    long result = 0;
    for (long i = 1; i <= n; i++) {
      result += (i * i * i);
    }
    return result;
  }
}
