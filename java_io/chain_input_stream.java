import java.io.*;
public class chain_input_stream {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("one.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            out.println("the text");
            // more code
            out.println("more text");
            // more code
        } catch (IOException e) {
            // exception handling left as an exercise for the reader
        }
    }
}
