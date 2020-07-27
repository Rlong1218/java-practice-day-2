public class RoundSum {
  static int roundSum(int a, int b, int c) {
    return rounder(a) + rounder(b) + rounder(c);
  }
  static int rounder(int n) {
    if(n % 10 >= 5) {
      return n + (10 - n % 10);
    } else {
      return n - n % 10;
    }
  }

}
