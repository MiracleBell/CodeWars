package kyu7.binary_addition;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void sampleTests() {
    assertAll(
        () -> assertEquals("10", Kata.binaryAddition(1, 1)),
        () -> assertEquals("1", Kata.binaryAddition(0, 1)),
        () -> assertEquals("1", Kata.binaryAddition(1, 0)),
        () -> assertEquals("100", Kata.binaryAddition(2, 2)),
        () -> assertEquals("111111", Kata.binaryAddition(51, 12))
    );
  }
}
