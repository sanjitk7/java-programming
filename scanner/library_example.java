import java.util.Scanner;

/*
Command Line Input:
int - nextInt()
string - next(), nextLine()
float - nextFloat()
double - nextDouble()
long - nextLong()
short - nextShort()

*/


public class library_example {
    int bid, bpages = 0;
    float bprice = 0.0F;
    String btitle;

    void get_lib() {
        System.out.println("Enter book details - Title, ID, Pages, Price:\n");
        Scanner s = new Scanner(System.in);
        btitle = s.nextLine();
        bid = s.nextInt();
        bpages = s.nextInt();
        bprice = s.nextFloat();
        s.close();
    }

    void display_lib() {
        System.out.println("The book details are: " + bid + " " + bpages + " " + bpages + " " + btitle);
    }

    public static void main(String[] args) {
        library_example l1 = new library_example();
        l1.get_lib();
        l1.display_lib();
    }
}