package kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PositiveTest {

  @Test
  public void testSomething() {
    assertEquals(15, Positive.sum(new int[]{1, 2, 3, 4, 5}));
    assertEquals(13, Positive.sum(new int[]{1, -2, 3, 4, 5}));
    assertEquals(0, Positive.sum(new int[]{}));
    assertEquals(0, Positive.sum(new int[]{-1, -2, -3, -4, -5}));
    assertEquals(9, Positive.sum(new int[]{-1, 2, 3, 4, -5}));
  }
}
