
import java.util.Enumeration;

import java.util.Vector;

public class vector_list {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>(2,3);

        v.add("1001");
        v.add("1002");
        v.add("1003");

        Enumeration<String> en = v.elements();

        while (en.hasMoreElements()) {

            System.out.println(en.nextElement());
        }
    }
}
