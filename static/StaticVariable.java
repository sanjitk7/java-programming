class staticvarclass {
    static int a = 100;

    static {
        System.out.println("this is static block"); // prints when class is created
    }

}

class anotherClass {
    static void getData() {
        System.out.println("$$" + staticvarclass.a);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        staticvarclass s = new staticvarclass();
        System.out.println(s.a); // both are valid
        System.out.println(staticvarclass.a);// both are valid (but this is rec)
        // anotherClass b = new anotherClass();
        // b.getData();
        anotherClass.getData();
    }
}
