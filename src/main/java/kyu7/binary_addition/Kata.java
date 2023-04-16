package kyu7.binary_addition;

/**
 * Implement a function that adds two numbers together and returns their sum in binary. The
 * conversion can be done before, or after the addition.
 * <p>
 * The binary number returned should be a string.
 * <p>
 * Example:
 * 1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
 * 5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)
 */

//Solved
public class Kata {

  public static String binaryAddition(int a, int b) {
    return Integer.toBinaryString(a + b);
  }
}
