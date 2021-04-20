class ex1 implements Cloneable{
    int a =100;
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class ex2{
    int b = 200;
}

public class clone_methond  {

    public static void main(String[] args) {
        ex1 e1 = new ex1();
        // ex1 e11 = ex1(e1).clone();   
    }

}
