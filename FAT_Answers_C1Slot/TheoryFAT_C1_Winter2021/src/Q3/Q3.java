package Q3;

import java.util.Scanner;

class InvalidTriangleException extends Exception{
    InvalidTriangleException(String m){
        super(m);
    }
}

class Triangle{
    int side1,side2,side3;
    static int count = 0;
    Triangle(int s1, int s2, int s3){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;

        try{
            if (s1==0 || s2==0 || s3==0 || (s1 + s2 < s3) || (s2 + s3 < s1) || (s3 + s1 < s2)){
                count++;
                throw new InvalidTriangleException("Invalid Side Measurements!");
            }
        } catch (InvalidTriangleException e){
            System.out.println(e);
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        int s1,s2,s3;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Triangle tArr[] = new Triangle[n];
        for (int i=0;i<n;i++){
            s1 = sc.nextInt();
            s2 = sc.nextInt();
            s3 = sc.nextInt();
            tArr[i] = new Triangle(s1,s2,s3);
        }
        System.out.println("Number of Invalid Trianges = "+Triangle.count);
    }
}
