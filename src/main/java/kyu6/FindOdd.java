package kyu6;

public class FindOdd {

  /**
   * Given an array of integers, find the one that appears an odd number of times.
   *
   * There will always be only one integer that appears an odd number of times.
   * */

  public static int findIt(int[] array) {
    int xor = 0;
    for (int i = 0; i < array.length; i++) {
      xor ^= array[i];
    }
    return xor;
  }
}
