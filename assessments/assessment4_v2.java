import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class employee22 {
    public String employee22_name;
    public int employee22_id;
    public int age;
    public int phoneNumber;

    employee22(String employee22_name, int employee22_id, int age, int phoneNumber) {
        this.employee22_name = employee22_name;
        this.employee22_id = employee22_id;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}

class InvalidEmployee22Id extends Exception {
    String exDesc;

    InvalidEmployee22Id(String exDesc) {
        super(exDesc);
    }
}

class InvalidNameFormat extends Exception {
    String namedesc;

    InvalidNameFormat(String namedesc) {
        super(namedesc);
    }
}

class tests {
    public static void main(String args[]) {
        employee22 arr[] = new employee22[4];
        Scanner s = new Scanner(System.in);
        arr[0] = new employee22("prateek", 123, 25, 1000000000);
        arr[1] = new employee22("java", 1234, 27, 20000000);
        arr[2] = new employee22("class", 456, 37, 40000000);
        arr[3] = new employee22("javatwo", 789, 45, 9000000);

        int search_id = s.nextInt();

        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (arr[i].employee22_id == search_id) {
                count += 1;
            }
        }
        int name_count = 0;
        for (int i = 0; i < 4; i++) {
            Pattern p = Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(arr[i].employee22_name);
            if (m.find()) {
                name_count += 1;
            }
        }

        try {
            if (count == 0) {
                throw new InvalidEmployee22Id("The Employee22 ID is Incorrect");
            }
            if (name_count > 0) {
                throw new InvalidNameFormat("The Employee22 name cannot have special characters or numbers");
            }
            System.out.println("Employee22 ID Found and Name is correct");

            for (int i = 0; i < 4; i++) {
                if (arr[i].employee22_id == search_id) {
                    System.out.println("Employee22 ID: " + arr[i].employee22_id + "\n" + "Employee22 Name: "
                            + arr[i].employee22_name + "\n" + "Employee22 Age: " + arr[i].age + "\n"
                            + "Employee22 Number: " + arr[i].phoneNumber);
                }
            }
        } catch (InvalidEmployee22Id x) {
            System.out.println(x);
        } catch (InvalidNameFormat y) {
            System.out.println(y);
        }
    }

}