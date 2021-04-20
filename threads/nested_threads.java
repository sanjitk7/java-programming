class thread1 extends Thread {
    class thread2 extends Thread {
        class thread3 extends Thread {

            public void run() {
                try {
                    System.out.println("thread3");
                    sleep(3000);
                    System.out.println(" Thread3 isrunning now... ");
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
        }
    }
}

public class nested_threads {
    public static void main(String arg[]) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();
        System.err.println("Starting thread");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("threads started");
    }
}

// Cannot be initialized this way?