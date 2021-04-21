import java.io.*;

class data_inputstream {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("one.txt");
        DataInputStream di = new DataInputStream(in);   
        int count = in.available();
        byte[] ary = new byte[count];
        di.read(ary);
        for (byte bt : ary) {
            char k = (char) bt;
            System.out.print(k);
        }
    }
}