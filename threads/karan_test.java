import java.util.Scanner;
import java.util.Arrays;

class display_thread extends Thread {
    String[] arr;
    display_thread(String[] arr){
        this.arr = arr;
    }
    synchronized public void run(String[] arr) {
    System.out.println(Arrays.toString(arr));
}

class sort_thread extends Thread {
    int size;
    String[] arr;
    sort_thread(int size,String[] arr){
        this.size = size;
        this.arr = arr;
    }
    synchronized public void run(int size,String[] arr) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // compares each elements of the array to all the remaining elements
                if (arr[i].compareTo(arr[j]) > 0) {
                    // swapping array elements
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        display_thread t3 = new display_thread(arr);
        t3.start();
    }
}

class read_thread extends Thread {

    synchronized public void run() {
        Scanner s = new Scanner(System.in);
        String[] arr = { "Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark",
                "France", "Netherlands", "Italy", "Germany" };
        int size = arr.length;
        sort_thread t2 = new sort_thread(size,arr);
        t2.start();

    }
}

public class karan_test {
    public static void main(String[] args) {
        read_thread t1 = new read_thread();
        t1.start();
    }
}


