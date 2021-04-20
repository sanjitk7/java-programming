class bank extends Thread {
    int amount = 1000;

    void withdraw(int amount) {
        synchronized (this) {
            System.out.println("Withdrawing...");
            if (this.amount < amount) {
                System.out.println("Low balance....");
                try {
                    wait(); // makes the thread wait for notify to be called from the same thread class but a different instance
                } catch (Exception e) {
                    System.out.println(e);
                }
            } // if ends
            this.amount = this.amount - amount;
            System.out.println("withdraw completed");
        }
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount = this.amount + amount;
        System.out.println("deposit completed... ");
        notify(); // wakes up a single thread that is waiting on this object's monitor (if many - chosen arbitrarily)
    }
} // bank ends

class notify_example {
    public static void main(String args[]) {
        bank s = new bank();
        new Thread() {
            public void run() {
                s.withdraw(1500);
            }
        }.start();
        new Thread() {
            public void run() {
                s.deposit(1000);
            }
        }.start();
    }
}