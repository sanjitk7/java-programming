
class deadlock {
    public static void main(String aa[]) {
        final String a = "a";
        final String b = "b";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (a) {
                    System.out.println("thread1: locked a");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized (b) {
                        System.out.println("thread1: locked b");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (b) {
                    System.out.println("Thread 2: locked b");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized (a) {
                        System.out.println("Thread 2: locked a");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}