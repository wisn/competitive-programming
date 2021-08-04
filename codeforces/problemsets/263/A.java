import java.io.*;
import java.math.*;
import java.util.*;

public class A {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Point p = null;

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        int x = scanner.nextInt();

        if (x == 1) {
          p = new Point(i + 1, j + 1);
        }
      }
    }

    System.out.println(p.numOfOperations());
  }


  private static class Point {

    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int numOfOperations() {
      return Math.abs(3 - x) + Math.abs(3 - y);
    }

  }

}
