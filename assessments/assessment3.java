import java.util.Scanner;

class number {
    void calculate() {
        // Scanner s = new Scanner(System.in);
        // int num = s.nextInt();
        // s.close();

        int num = 51;
        int sum = 0;

        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        System.out.println("The Sum of Digits : "+sum);
    }
}

class quadratic extends number {
    void calculate() {
        // int a, b, c;
        // Scanner s = new Scanner(System.in);
        // a = s.nextInt();
        // b = s.nextInt();
        // c = s.nextInt();
        // s.close();
        int a = 1;
        int b = 2;
        int c = 1;

        double d = b * b - 4.0 * a * c;

        if (d > 0.0) {
            
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (d == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("Roots are not real.");
        }

    }
}

class sos extends number{
    void calculate(){
        // System.out.println("Enter A number for calculating the sum of squares of all natural numbers till that number:");
        // Scanner s = new Scanner(System.in);
        // int num = s.nextInt();
        // s.close();
        int num = 4;
        int sum_of_sq=0;
        for (int i=0;i<num;i++){
            sum_of_sq+=Math.pow(i, 2);
        }
        System.out.println("The sum of squares till given number are : "+sum_of_sq);
    }
}

public class assessment3 {
    public static void main(String[] args) {
        System.out.println("Choose the operation:\n1. Calculate Sum of Digits\n2. Solve Quadratic Equation\n3. Calculate Sum of Squares");
        Scanner s = new Scanner(System.in);
        int ch = s.nextInt();
        s.close();
        switch(ch){
            case 1:
                number obj1 = new number();
                obj1.calculate();
                break;
            case 2:
                quadratic obj2 = new quadratic();
                obj2.calculate();
                break;
            case 3:
                sos obj3 = new sos();
                obj3.calculate();
                break;
        }
    }
}
