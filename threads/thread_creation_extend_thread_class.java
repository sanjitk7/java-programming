class example_thread extends Thread { 
    public void run() { 
        try{ 
            System.out.println (Thread.currentThread());
        } 
        catch (Exception e) { 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
public class thread_creation_extend_thread_class {
    public static void main(String[] args) {
        example_thread t1 = new example_thread(); 
        t1.start();    
    }
}
