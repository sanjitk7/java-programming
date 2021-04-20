class join_thread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(currentThread().getName() + i);
        }
    }

    public static void main(String args[]) {
        join_thread t1 = new join_thread();
        join_thread t2 = new join_thread();
        join_thread t3 = new join_thread();
        t1.start();
        try {
            t1.join(); // waits till t1 finishes before proceeding with the main thread
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}