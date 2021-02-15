public class cmd {
    public static void main(String[] args) {
        // System.out.println("THESE ARE THE STRING COMMAND LINE ARGUMENTS:");
        // System.out.println(args[0] + " " + args[1]);

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a+b);

        
    }
}

// java CommandLineArguments.java Example String
// cannot type cast the datatype like in C like (int)args[0] (since int variable is an object of Integer Class ). So use Integer.parseInt()