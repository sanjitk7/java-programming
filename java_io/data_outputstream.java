import java.io.*;
public class data_outputstream {
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("one.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        // data.writeChars("This is Dataoutputstream programming");
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}
