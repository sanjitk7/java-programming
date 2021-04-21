import java.io.*;

public class buffered_outputstream {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("one.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "written with buffered output stream";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}