package package_main;

public class using_package {
    public static void main(String[] args) {
        System.out.println("This is the package that consumes the other package.");
    }
}

// first compile the package 1 - javac -d . used_package.java (dont run - doesnt have main)
// compile package 2 - javac -d . using_package.java
// run the second program - java package_main.using_package (note 'dot')