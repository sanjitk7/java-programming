import java.util.Scanner;

class number {
    void calculate() {
        System.out.println("Enter the number whose sum of digits is to be calculated:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

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
        int a, b, c;
        System.out.println("Enter the values of a, b and c in the standard quadratic equation ax^2 + bx + x:");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        double root1, root2, imaginary, discriminant;
		discriminant = (b * b) - (4 * a *c);
	  	
	  	if(discriminant > 0)
	  	{
	  		root1 = (-b + Math.sqrt(discriminant) / (2 * a));
	  		root2 = (-b - Math.sqrt(discriminant) / (2 * a));
	  		System.out.println("\n Two Distinct Real Roots Exists: root1 = " + root1 + " and root2 = " + root2);
	  	}
	  	else if(discriminant == 0)
	  	{
	  		root1 = root2 = -b / (2 * a);
	  		System.out.println("\n Two Equal and Real Roots Exists: root1 = " + root1 + " and root2 = " + root2);
	  	}
	  	else if(discriminant < 0)
	  	{
	  		root1 = root2 = -b / (2 * a);
	  		imaginary = Math.sqrt(-discriminant) / (2 * a);
	  		System.out.println("\n Two Distinct Complex Roots Exists: root1 = " + root1 + 
	  					" + " + imaginary + " and root2 = " + root2 +" - " +imaginary);
	  	}		

    }
}

class sos extends number{
    void calculate(){
        System.out.println("Enter A number for calculating the sum of squares of all natural numbers till that number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();


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
