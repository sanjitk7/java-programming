public class single_inheritance {
    public class projectmanager extends Person {
        int projectAccount = 1234;
        String projectWorkSpace = "bangalore";
        int size = 20;
    }

    public class Person {
        int SSN = 1234;
        String name = "hariprasad";
        String nativePlace = "chennai";

        public void display() {
            System.out.println("SSN=" + SSN);
            System.out.println("name=" + name);
            System.out.println("nativePlace=" + nativePlace);

        }

    }

    public static void main(String args[]) {
        projectmanager pm = new projectmanager();
        pm.display();
        System.out.println(pm.projectAccount);
        System.out.println(pm.projectWorkSpace);
        System.out.println(pm.size);

    }
}
