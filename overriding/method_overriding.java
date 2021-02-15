// Override the function. Access the display in the parent method
// calling child constructor auto-invokes parent constructor
// even in the absence of the child constructor the parent constructor is called
// on child obj creation
class parent {
    parent() {
        System.out.println("parent const");
    }

    void display() {
        System.out.println("Hello from parent");
    }
}

class child extends parent {
    child() {
        System.out.println("Child const");
    }

    void display() {
        super.display();
        System.out.println("Hello from child");
    }
}

public class method_overriding {

    public static void main(String[] args) {
        child c = new child();
        c.display();

    }
}