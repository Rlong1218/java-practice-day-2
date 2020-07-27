import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NoTeenSumTest {

  @Test
  void noTeenSum() {
    assertEquals(15, NoTeenSum.noTeenSum(5, 5, 5));
    assertEquals(18, NoTeenSum.noTeenSum(9, 18, 9));
    assertEquals(16, NoTeenSum.noTeenSum(15, 1, 17));
    assertEquals(18, NoTeenSum.noTeenSum(16, 2, 14));
    assertEquals(46, NoTeenSum.noTeenSum(15, 16, 15));
    assertNotEquals(18, NoTeenSum.noTeenSum(9, 18, 9));
  }
}