import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class bufferedinputstream_mark_reset {
    public static void main(String[] args) throws Exception {
        InputStream iStream = null;
        BufferedInputStream bis = null;
        try {
            // read from file one.txt to input stream
            iStream = new FileInputStream("one.txt");
            // input stream converted to buffered input stream
            bis = new BufferedInputStream(iStream);
            // read and print characters one by one
            System.out.println("Char : " + (char) bis.read());
            System.out.println("Char : " + (char) bis.read());
            // mark is set on the input stream
            bis.mark(0);
            System.out.println("Char : " + (char) bis.read());
            System.out.println("reset() invoked");
            // reset is called
            bis.reset();
            // read and print characters
            System.out.println("char : " + (char) bis.read());
            System.out.println("char : " + (char) bis.read());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}