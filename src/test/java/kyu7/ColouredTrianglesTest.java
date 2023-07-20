package kyu7;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ColouredTrianglesTest {

  @Test
  public void examples() {
    var result = ColouredTriangles.triangle("GB");
    assertEquals('R', ColouredTriangles.triangle("GB"));
    assertEquals('R', ColouredTriangles.triangle("RRR"));
    assertEquals('B', ColouredTriangles.triangle("RGBG"));
    assertEquals('G', ColouredTriangles.triangle("RBRGBRB"));
    assertEquals('G', ColouredTriangles.triangle("RBRGBRBGGRRRBGBBBGG"));
    assertEquals('B', ColouredTriangles.triangle("B"));
  }
}
