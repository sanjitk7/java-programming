import java.util.*;
class array_list{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("ZAZ");
        al.add("XAX");
        al.add("YAY");
        al.add("WAW");
        Iterator i = al.Iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}