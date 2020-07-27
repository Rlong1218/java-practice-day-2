// Given 3 int values, a b c, return their sum. However,
// if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0,
// except 15 and 16 do not count as a teens.

public class NoTeenSum {
  static int noTeenSum(int a, int b, int c) {
    return fixTeen(a) + fixTeen(b) + fixTeen(c);
  }
  static int fixTeen(int n) {
    if(n >= 13 && n <= 19 && n != 15 && n != 16) {
      n = 0;
    }
    return n;
  }
}



