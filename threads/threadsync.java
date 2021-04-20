class multi {
    synchronized void multiplication(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class threadsync {
    public static void main(String aa[]) {
        multi m = new multi();
        example_thread_3 t1 = new example_thread_3(m);
        thread2 t2 = new thread2(m);
        t1.start();
        t2.start();
    }
}

class example_thread_3 extends Thread {
    multi m;

    example_thread_3(multi t) {
        this.m = t;
    }

    public void run() {
        m.multiplication(5);
    }
}

class thread2 extends Thread {
    multi m;

    thread2(multi t) {
        this.m = t;
    }

    public void run() {
        m.multiplication(10);
    }
}

// without the synchronized keyword
/*
5
10
10
20
15
30
20
40
25
50
*/

// the resources are not exactly shared since the threads have their own instances of the object
// but since they run simultaneosly the values don't print in the order they are supposed to

// with synchronized
/*
5
10
15
20
25
10
20
30
40
50
*/

// the function itself doesn't execute in any other thread when its executing in one instance