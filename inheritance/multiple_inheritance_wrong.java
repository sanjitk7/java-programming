
class A {
    void show() {
        System.out.println("SDF");
    }
}

class B {
    void show1() {
        System.out.println("SDFsadfasdf");
    }
}

// Inheriting from 2 classes with classes is not possible, use interfaces instead
class C extends A //,B 
{
    
    void show2() {
        System.out.println("SDFsdafasfs");
    }
}

public class multiple_inheritance_wrong {
    public static void main(String a[]) {
        C b1 = new C();
        b1.show2();
    }
}