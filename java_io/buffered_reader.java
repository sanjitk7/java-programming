import java.io.*;

public class buffered_reader {
    public static void main(String args[]) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter your Regno and name");
        String name = br.readLine();
        int no = Integer.parseInt(br.readLine());
        System.out.println(" Hello " + name + " " + no);
    }
}