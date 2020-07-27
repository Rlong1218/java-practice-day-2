import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EndOtherTest {

  @Test
  void endOther() {
    assertTrue(EndOther.endOther("AbC", "asdaBc"));
    assertTrue(EndOther.endOther("Knowledge", "ledge"));
    assertTrue(EndOther.endOther("PinG", "popping"));
    assertTrue(EndOther.endOther("Transit", "SIT"));
    assertFalse(EndOther.endOther("AbC", "asdaBc"));
  }
}