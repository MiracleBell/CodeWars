package kyu8.string_repeat;

/**
 * Java 17
 *
 * Write a function that accepts an integer n and a string s as parameters, and returns a string of
 * s repeated exactly n times.
 * <p>
 * Examples (input -> output):
 * <p>
 * 6, "I"     -> "IIIIII"
 * <p>
 * 5, "Hello" -> "HelloHelloHelloHelloHello"
 */

public class Solution {

  public static String repeatStr(final int repeat, final String string) {
    return string.repeat(repeat);
  }
}
