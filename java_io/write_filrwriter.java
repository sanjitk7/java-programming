import java.io.FileWriter;
import java.io.IOException;

public class write_filrwriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("one.txt"); // FileWriter("one.txt",true) // the second boolean argument means file will be appended and not over written
            fw.write("First file program to write something on it");
            fw.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}