/*
INHERTITENCE 
1) reusability of code
2) extension of classes 
3) building new class upon the existing one 
4) upgradation 
5) extending its functionality 
6) properties of variable remains same 

—————————————————————————————————————————————
SYNTAX FOR INHERITENCE 
class parent{
}
class child extends parent{}
—————————————————————————————————————————————

types of inheritance 
1) single inheritance 
2) multiple inheritance (not possible in java) - can be achieved using interface
3) hybrid inheritance  
4) hybrid inheritance
5) multilevel inheritance  (not possible in java) - can be achieved using interface 
*/
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
