class this_2 {
    int a;
    int b;

    this_2() {
        this(10, 20);
        System.out.println("Inside  default constructor \n");
    }

    this_2(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + b);
        System.out.println("Inside parameterized constructor");
    }

    public static void main(String[] args) {
        this_2 t = new this_2();
    }
}
