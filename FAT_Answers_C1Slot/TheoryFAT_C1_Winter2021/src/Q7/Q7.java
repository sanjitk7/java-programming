package QQ;


import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;

public class Q7 {
    public static void main(String args[]) {
        // implementation of HashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // addding keys and values to HashMap
        hm.put(10, "Tamil Nadu");
        hm.put(12, "Kerala");
        hm.put(100, "Karnataka");
        hm.put(130, "Andhra Pradesh");
        hm.put(49, "Punjab");
        hm.put(22, "Himachal Pradesh");
        hm.put(40, "Maharashtra");
        hm.put(33, "West Bengal");
        hm.put(26, "Gujrat");
        hm.put(76, "Orissa");

        Iterator<Integer> it = hm.keySet().iterator();
        System.out.println("Before Sorting");

        while (it.hasNext()) {
            int key = (int) it.next();
            System.out.println("Cases:  " + key + "     State:   " + hm.get(key));
        }

        System.out.println("\n");
        Map<Integer, String> map = new HashMap<Integer, String>();
        System.out.println("After Sorting");

        // using TreeMap constructor to sort the HashMap
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);
        Iterator itr = tm.keySet().iterator();
        while (itr.hasNext()) {
            int key = (int) itr.next();
            System.out.println("Cases:  " + key + "     State:   " + hm.get(key));
        }

    }
}