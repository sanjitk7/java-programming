package lambda;

public class lambda {

    interface inter1 {
        int operation(int a, int b);
    }

    interface inter2 {
        void operation(String message);
    }

    private int operate(int a, int b, inter1 i){
        return i.operation(a,b);
    }

    public static void main(String[] args) {
        inter1 add = (int x, int y) -> x+y;
        inter1 multiply = (int x, int y) -> x*y;

        lambda l = new lambda();
        System.out.println("Addition is : "+ l.operate(2,2,add));
        System.out.println("Multiplication is : "+ l.operate(2,2,multiply));

        inter2 i2 = msg -> System.out.println(msg);
        i2.show("hello world");
    }
}
