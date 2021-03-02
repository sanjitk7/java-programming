public class garbage {
    public void finalize() {
        System.out.println("object is garbage collected");
    }

    public static void main(String args[]) {
        garbage g1 = new garbage();
        garbage g2 = new garbage();
        garbage g3 = new garbage();
        g1 = null;
        g2 = null;
        g3 = null;
        System.gc();

        System.out.println("SADF");
    }
}