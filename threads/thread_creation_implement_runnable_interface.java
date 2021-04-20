class parent_example { 
    public void m1() { 
        System.out.println("Hello Visitors"); 
    } 
} 

// this kind of multiple inheritance isnt possible by extending Thread class
class example_thread_2 extends parent_example implements Runnable // so use the runnable interface instead of extending Thread class
{ 
    public void run() { 
        System.out.println("Child Thread"); 
    }
}

public class thread_creation_implement_runnable_interface {

    public static void main(String[] args) {
        example_thread_2 t = new example_thread_2();
        t.m1();
        Thread t1 = new Thread(t); // while using the runnable interface route to create a thread
        t1.start();
        System.out.println("Main thread");
    }
}
