import java.io.*;

public class buffered_writer {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("c://users/admin/desktop/java/one.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to java File handling programming.");
        buffer.close();
        System.out.println("Success");
    }
}