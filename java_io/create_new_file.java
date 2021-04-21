import java.io.*;
public class create_new_file {
    public static void main(String[] args) {
        try {
            File f = new File("firstfile.txt");
            if (f.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
