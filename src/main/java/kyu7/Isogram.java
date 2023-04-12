package kyu7;

/**
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a
 * function that determines whether a string that contains only letters is an isogram. Assume the
 * empty string is an isogram. Ignore letter case.
 */

//Solved
public class Isogram {

  public static boolean isIsogram(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.toLowerCase().lastIndexOf(str.charAt(i)) != str.indexOf(
          str.toLowerCase().charAt(i))) {
        return false;
      }
    }
    return true;
  }
}
