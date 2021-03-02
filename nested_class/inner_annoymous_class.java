abstract class Employee {
    abstract void working();
}

class inner_annoymous_class {
    public static void main(String args[]) {
        Employee e = new Employee() 
        // annoymous class
        {
            void working() {
                System.out.println("I am a software Engineer");
            }
        };
        e.working();
    }
}