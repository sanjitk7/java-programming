class outer1 {
    private int a = 100;
    int get_ab_outer(){
        outer1.inner1 ii = new outer1().new inner1();
        System.out.println("from the inner a "+a);
        System.out.println("from the inner b "+ii.b);
        return a;
    }
    class inner1{
        private int b = 200;
        public int get_ab_inner(){
            System.out.println("from the inner a "+a);
            System.out.println("from the inner b "+b);
            return a;
        }
    }
}

public class inner_class2 {
    public static void main(String[] args) {
        outer1 o = new outer1();
        // System.out.println(o.a);

        outer1.inner1 i = o.new inner1();
        // System.out.println(i.b);

        System.out.println(i.get_ab_inner());
        System.out.println(o.get_ab_outer());
    }
}

// if a or b are private then it cannot be accessed in the main class's main function
// if they are public then can be instantiated accordingly like in inner_class1.java and accessed from main
// to access private var of inner class (b) from main (of a different main class) you need to create getter function accordingly in the inner class
// to access private var of outer class (a) from main (of a different main class) you need to create getter function in inner or outer classes (since inner class can access outer class private var) 


// static inner class and static inner member variable
// class inside interface
// interface inside class
// class inside class and interface inside interface
