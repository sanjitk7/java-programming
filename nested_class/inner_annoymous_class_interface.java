// Anonyms inner class using interface
interface creature {
    void legs();
}

class inner_annoymous_class_interface {
    public static void main(String args[]) {
        creature a = new creature() {
            public void legs() {
                System.out.println("All animals have 4 legs");
            }
        };
        a.legs();
    }
}
