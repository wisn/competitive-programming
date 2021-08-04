import java.io.*;
import java.util.*;

public class B {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String s = scanner.next();
    char[] chars = s.toCharArray();

    String ans = "";
    int n = chars.length;

    for (int i = 0; i < n;) {
      if (chars[i] == '.') {
        ans += "0";
        i += 1;
      } else {
        ans += chars[i + 1] == '.' ? "1" : "2";
        i += 2;
      }
    }

    System.out.println(ans);
  }

}
