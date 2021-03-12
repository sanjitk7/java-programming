class this_1 {
    int a;
    int b;

    // Parameterized constructor
    this_1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        // Displaying value of variables a and b
        System.out.println("a = " + a + "  b = " + b);
    }

    public static void main(String[] args) {
        this_1 t = new this_1(10, 20);
        this_1 u = new this_1(100, 200);
        t.display();
        u.display();
    }
}