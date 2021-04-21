import java.io.*;
import java.util.Scanner; // Import the Scanner class to read text files

public class read_filereader {
    public static void main(String[] args) {
        try {
            // 
            File f = new File("one.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String data = s.nextLine();
                System.out.println(data);
            }
            
            // Using File Reader
            FileReader fr = new FileReader("one.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
                fr.close();

            s.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Error occurred: "+e);
        } catch (IOException e){
            System.out.println("IO Error: "+e);
        }
    }
}
