package kyu8;

/**
 * Java 17
 *
 * Write a program that finds the summation of every number from 1 to num. The number will always be
 * a positive integer greater than 0.
 * <p>
 * For example (Input -> Output):
 * <p>
 * 2 -> 3 (1 + 2)
 * <p>
 * 8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
 */


//Solved
public class GrassHopper {

  public static int summation(int n) {
    return n * (n + 1) / 2;
  }
}
