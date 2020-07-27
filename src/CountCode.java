public class CountCode {
  static int countCode(String str) {
    char[] counter = str.toCharArray();
    int count = 0;

    for (int i = 0; i < counter.length - 1 ; i++) {
      if (i < counter.length - 3 && counter[i] == 'c'
          && counter[i+1] == 'o' && counter[i+3] == 'e' ) {
        count++;
      }
    }
    return count;
  }
}
