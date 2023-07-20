package kyu8;

import java.util.Arrays;

public class Positive {

  public static int sum(int[] array) {
    return Arrays.stream(array).filter(a -> a >= 0).sum();
  }
}
