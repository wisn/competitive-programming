import java.io.*;
import java.util.*;

public class B {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    int t = scanner.nextInt();
    String s = scanner.next();

    char[] chars = s.toCharArray();

    while (t-- > 0) {
      for (int i = 0; i < (n - 1);) {
        if (chars[i] == 'B' && chars[i + 1] == 'G') {
          chars[i] = 'G';
          chars[i + 1] = 'B';
          i += 2;
        } else {
          i += 1;
        }
      }
    }

    System.out.println(chars);
  }

}
