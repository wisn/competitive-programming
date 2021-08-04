import java.io.*;
import java.util.*;

public class A {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    int weight = scanner.nextInt();

    if (weight > 2 && weight % 2 == 0) {
      System.out.println("YES");
      return;
    }

    System.out.println("NO");
  }

}
