class fixi extends Thread {
    float student_count[] = new float[10];
    float marks[] = new float[10];
    private float sum;

    fixi(float a[], float b[]) {
        student_count = a;
        marks = b;
    }

    public float fixi_get() {
        return sum;
    }

    public void run() {
        try {
            for (int i = 0; i < student_count.length; i++) {
                sum += student_count[i] * marks[i]; // f1*xi formula
            }
            System.out.println("\nResult of FiXi from thread1 :" + sum);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class marks extends Thread {
    float marks[] = new float[10];
    private float sum;

    marks(float b[]) {
        marks = b;
    }

    public float marks_get() {
        return sum;
    }

    public void run() {
        try {
            for (int i = 0; i < marks.length; i++) {
                sum += marks[i];
            }
            System.out.println("Result of Xi from thread2 :" + sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class assessment6_v1 {
    public static void main(String args[]) {

        // initialise data
        float marks[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        float student_count[] = { 3, 4, 17, 8, 23, 10, 4, 6, 5, 2 };

        // spawn threads
        fixi thread1 = new fixi(student_count, marks);
        marks thread2 = new marks(marks);

        // start threads
        thread1.start();
        thread2.start();

        // wait for thread execution
        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            System.out.println("Error: Join Thread Exception");
        }

        // calculate average in main thread
        float avg = thread1.fixi_get() / thread2.marks_get();
        System.out.println("\nThe Average Calculated in the main thread is: " + avg + "\n");
    }
}