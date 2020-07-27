public class EndOther {
  static boolean endOther(String a, String b) {
    String first = a.toLowerCase();
    String second = b.toLowerCase();
    return (first.endsWith(second) || second.endsWith(first));
  }
}
