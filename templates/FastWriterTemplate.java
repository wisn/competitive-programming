/*!
 * FastWriter
 *
 * Write output fast!
 * Prove it by solving https://www.spoj.com/problems/INOUTEST/ problem.
 * We need both FastReader and FastWriter to solve the problem!
 *
 * Available APIs:
 *    - out()
 *    - outln()
 *    - done()
 *
 * Note: Call `done()` whenever you want to flush out the buffered output.
 */

import java.io.*;
import java.util.*;

public class FastWriterTemplate {

  public static class FastWriter {

    private BufferedWriter writer;

    public FastWriter() {
      writer = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public void out(Object obj) throws Exception {
      writer.write(obj.toString());
    }

    public void outln(Object obj) throws Exception {
      writer.write(obj.toString() + "\n");
    }

    public void done() throws Exception {
      writer.flush();
    }

  }

}
