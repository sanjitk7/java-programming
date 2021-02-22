import java.util.Scanner;

abstract class my_abstract_class{
    abstract double process(double P, double R);
}

class Discount extends my_abstract_class{

    double process(double P, double R){
        double net;
        net = P-P*R/100;
        return net;
    }
}

class Tax extends my_abstract_class{
    double process(double P, double R){
        double total;
        total = P+P*R/100;
        return total;
    }
}

public class assessment2 {
    public static void main(String[] args) {
        double A,B;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Principle and Rate:");
        A = s.nextDouble();
        B = s.nextDouble();
        s.close();
        // A = 100.55D;
        // B = 200.55D;
        Discount dis = new Discount();
        Tax tax = new Tax();
        System.out.println("So the Discount is:");
        System.out.println(Math.floor(dis.process(A, B) * 100) / 100);
        System.out.println("So the Tax is:");
        System.out.println(Math.floor(tax.process(A, B) * 100) / 100);
        System.out.println("(Note that decimal values are limited to 2 decimal places)");

    }
}
