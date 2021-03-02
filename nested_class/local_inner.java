class local_inner {
    private int a = 330;// instance variable

    void display() {
        class Local { // local inner class
            void show() {
                System.out.println(a);
            }
        }
        Local l = new Local();
        l.show();
    }

    public static void main(String args[]) {
        local_inner lo = new local_inner();
        lo.display();
    }
}