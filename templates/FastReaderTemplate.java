/*!
 * FastReader
 *
 * Read input fast!
 * Prove it by solving https://www.spoj.com/problems/INTEST/ problem.
 *
 * Available APIs:
 *    - next()
 *    - nextLine()
 *    - nextInt()
 *    - nextLong()
 *    - nextDouble()
 *    - close()
 *
 * Note: Use `close()` to close the input stream. It is optional though.
 */

import java.io.*;
import java.util.*;

public class FastReaderTemplate {

  public static class FastReader {

    private InputStream inputStream;
    private byte[] buffers = new byte[1 << 17];
    private int pointer = 0;

    public FastReader() {
      this.inputStream = new DataInputStream(System.in);
    }

    public FastReader(InputStream inputStream) {
      this.inputStream = inputStream;
    }

    public FastReader(String fileName) throws Exception {
      this.inputStream = new FileInputStream(fileName);
    }


    public String next() throws Exception {
      StringBuilder ret = new StringBuilder();
      byte chr = stripLeftBytes();

      while (chr > ' ') {
        ret.appendCodePoint(chr);
        chr = nextByte();
      }

      return ret.toString();
    }

    public String nextLine() throws Exception {
      StringBuilder ret = new StringBuilder();
      byte chr = nextByte();

      while (chr < ' ') {
        chr = nextByte();
      }

      while (chr >= ' ' && chr != '\n') {
        ret.appendCodePoint(chr);
        chr = nextByte();
      }

      return ret.toString();
    }

    public int nextInt() throws Exception {
      int ret = 0;
      byte chr = stripLeftBytes();

      boolean neg = false;
      if (chr == '-') {
        neg = true;
        chr = nextByte();
      }

      while ('0' <= chr && chr <= '9') {
        ret = ret * 10 + (chr - '0');
        chr = nextByte();
      }

      if (neg) {
        return -ret;
      }

      return ret;
    }

    public long nextLong() throws Exception {
      long ret = 0;
      byte chr = stripLeftBytes();

      boolean neg = false;
      if (chr == '-') {
        neg = true;
        chr = nextByte();
      }

      while ('0' <= chr && chr <= '9') {
        ret = ret * 10L + (chr - '0');
        chr = nextByte();
      }

      if (neg) {
        return -ret;
      }

      return ret;
    }

    public double nextDouble() throws Exception {
      return Double.parseDouble(next());
    }

    public void close() throws Exception {
      if (inputStream == null) {
        return;
      }

      inputStream.close();
    }


    private byte nextByte() throws Exception {
      if (pointer == buffers.length) {
        inputStream.read(buffers, 0, buffers.length);
        pointer = 0;
      }

      return buffers[pointer++];
    }

    private byte stripLeftBytes() throws Exception {
      byte chr = nextByte();
      while (chr <= ' ') {
        chr = nextByte();
      }

      return chr;
    }

  }

}
