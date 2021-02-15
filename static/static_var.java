class static_var{
    static int a = 100;
}

class anotherClass{
    static void getData(){
        System.out.println(staticvarclass.a);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        staticvarclass s = new staticvarclass();
        System.out.println(s.a); // both are valid
        System.out.println(staticvarclass.a);// both are valid
        // anotherClass b = new anotherClass();
        // b.getData();
        anotherClass.getData();
    }
}
