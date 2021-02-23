class outer {
    class inner{
        int a = 100;
    }
}

public class nested_class {
    public static void main(String[] args) {
        outer obj = new outer();
        outer.inner ob1 = obj. new inner();

        // outer.inner obj = new outer().new inner() // anonymously instantiates the outer class and then instantiates the inner class with it
        System.out.println(ob1.a);
    }
}