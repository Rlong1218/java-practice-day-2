import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoundSumTest {

  @Test
  void roundSum() {
    assertEquals(20, RoundSum.roundSum(11, 8, 4));
    assertEquals(90, RoundSum.roundSum(25, 38, 17));
    assertEquals(40, RoundSum.roundSum(16, 7, 14));
    assertEquals(50, RoundSum.roundSum(23, 19, 5));
    assertEquals(10, RoundSum.roundSum(1, 11, 4));
    assertNotEquals(20, RoundSum.roundSum(11, 8, 4));

  }
}