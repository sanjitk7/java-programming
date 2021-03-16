import java.lang.Runnable;

class example123 implements Runnable {
    int a;

    example123(int b) {
        a = b;
    }

    synchronized public void run() { // rm sync anc check
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * a);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
}

public class using_runnable_interface_thread {
    public static void main(String[] args) {
        example123 obj1 = new example123(5);
        example123 obj2 = new example123(10);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
// advantage of multiple inheritance in this approach
// with other approach cannot extend from 2/more classes
// synchronisation doesnt solve deadlock - sync without timeout can cause deadlock