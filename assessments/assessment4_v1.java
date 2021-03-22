import java.util.Scanner;

class MyException extends Exception {
    public MyException(String s) {
        // Call constructor of parent Exception
        super(s);
    }
}

class Employee {
    int age, phone, id;
    String name;

    void set_data(int age, int phone, int id, String name) {
        this.age = age;
        this.phone = phone;
        this.id = id;
        this.name = name;
    }

    void get_data() {
        System.out.println("The Name of the employee found is: " + this.name + "\n");
        System.out.println("The age of the employee found is: " + this.age + "\n");
        System.out.println("The phone number of the employee found is: " + this.phone + "\n");
    }
}

// A Class that uses above MyException
public class assessment4_v1 {
    // Driver Program
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int ch = 4;
        int uid, uage, uphone, count = 0;
        String uname;
        Employee e[] = new Employee[10];
        while (ch != 3) {
            System.out.println("Choose Operation. 1. Lookup Employee 2. Add Employee 3.Exit");
            ch = s.nextInt();
            if (ch == 2) {
                System.out.println("Enter the ID,age,phone and name of the Employee");
                uid = s.nextInt();
                uage = s.nextInt();
                uphone = s.nextInt();
                uname = s.nextLine();
                e[count].set_data(uage, uphone, uid, uname);
            }

        }

    }
}