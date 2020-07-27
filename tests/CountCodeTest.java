import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountCodeTest {

  @Test
  void countCode() {
    assertEquals(2, CountCode.countCode("cofeasdkfcodeoiads"));
    assertEquals(4, CountCode.countCode("colecodecotecovecoe"));
    assertEquals(1, CountCode.countCode("adslkjfcogeaodsif"));
    assertEquals(0, CountCode.countCode("aosdifhaaosjcniosadfh"));
    assertNotEquals(2, CountCode.countCode("cofeasdkfcodeoiads"));
  }
}