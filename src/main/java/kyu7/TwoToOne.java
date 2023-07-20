package kyu7;

/**
 * Java 11
 *
 * Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the
 * longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
 */

public class TwoToOne {

  public static String longest(String s1, String s2) {
    StringBuilder uniqueChars = new StringBuilder();
    (s1 + s2).chars()
        .distinct()
        .sorted()
        .forEach(value -> uniqueChars.append(Character.toChars(value)));

    return uniqueChars.toString();
  }
}
