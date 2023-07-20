package kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class OppositeNumberTest {
  @Test
  public void tests() {
    assertEquals(-1, OppositeNumber.opposite(1));
  }
}
