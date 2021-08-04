import java.io.*;
import java.util.*;

public class A {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    
    int x = 0;
    int y = 0;
    int z = 0;

    while (n-- > 0) {
      int xi = scanner.nextInt();
      int yi = scanner.nextInt();
      int zi = scanner.nextInt();

      x += xi;
      y += yi;
      z += zi;
    }

    if (x == 0 && y == 0 && z == 0) {
      System.out.println("YES");
      return;
    }

    System.out.println("NO");
  }

}
