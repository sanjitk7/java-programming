import java.io.*;
public class fileinputstream_fileoutputstream {
    public static void main(String args[]) {
        try {
            byte b[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < b.length; x++) {
                os.write(b[x]); // writes the bytes
            }
            os.close();
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + " ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
