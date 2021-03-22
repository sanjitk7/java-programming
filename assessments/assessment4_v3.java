import java.util.*;
import java.util.regex.*;

class InvalidName extends Exception {
    InvalidName(String s) {
        super(s);
    }
}

class InvalidID extends Exception {
    InvalidID(String s) {
        super(s);
    }
}

class Employee11 {
    String name, age, phone, id;
    void get_data(){
        System.out.println("The Name of the employee is: "+this.name+"\n");
        System.out.println("The age of the employee is: "+this.age+"\n");
        System.out.println("The phone number of the employee is: "+this.phone+"\n");
    }

}

public class assessment4_v3 {
    static void validate_name(String name) throws InvalidName {
        Pattern my_pattern = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
        Matcher my_match = my_pattern.matcher(name);
        if (my_match.find()) {
            throw new InvalidName("Name must not contain special characters or numbers");
        }
    }
    static void validate_id(String name) throws InvalidID {
        Pattern my_pattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
        Matcher my_match = my_pattern.matcher(name);
        if (my_match.find()) {
            throw new InvalidID("ID must not contain alphabet characters");
        }
    }

    public static void main(String args[]) {
        // System.out.println("Hello World!");
        Scanner s = new Scanner(System.in);
        Employee11[] obj = new Employee11[100];
        int count = 0;
        String temp;
        System.out.print("Enter the number of Employees to add");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            obj[i] = new Employee11();
            System.out.println("Enter Employee ID");
            temp = s.next();
            try {
                validate_id(temp);
                obj[i].id = temp;
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Enter Employee Name");
            temp = s.next();
            try {
                validate_name(temp);
                obj[i].name = temp;
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Enter Employee Phone Number");
            temp = s.next();
            try {
                obj[i].phone = temp;
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Enter Employee Age");
            temp = s.next();
            try {
                obj[i].age = temp;
            } catch (Exception e) {
                System.out.println(e);
            }
            count++;
        }
        System.out.println("The entered data has successfully been stored in the Employee Object Array.");

        for (int i=0;i<count;i++){
            obj[i].get_data();
        }
    }
}