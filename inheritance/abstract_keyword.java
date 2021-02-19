// cannot instantiate this class
abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

// Inherits Sleep and body of animalSound which is declared as abstract in
// parent
// class is provided here.
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

public class abstract_keyword {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
}
}