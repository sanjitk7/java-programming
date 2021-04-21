import java.io.*;

public class bytearray_input_output_stream {
    public static void main(String args[]) throws IOException {
        ByteArrayOutputStream b = new ByteArrayOutputStream(12);
        
        // write hello till 10 byte space is reached
        // if you replace 20 with a non multiple of size("hello") - Java heap space error
        while (b.size() != 20) {
            // Gets the inputs from the user
            b.write("hello".getBytes());
        }
        byte b1[] = b.toByteArray();
        System.out.println("Print the content");
        
        for (int x = 0; x < b1.length; x++) {
            // printing the characters
            System.out.print((char) b1[x] + " ");
        }
        System.out.println(" ");
        int c;
        ByteArrayInputStream bInput = new ByteArrayInputStream(b1);
        System.out.println("Converting characters to Upper case ");
        for (int y = 0; y < 1; y++) {
            while ((c = bInput.read()) != -1) {
                System.out.println(Character.toUpperCase((char) c));
            }
        }
    }
}