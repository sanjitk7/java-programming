package string_builder;

public class string_builder4 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Welcome");
        // sb.replace(1,3,"Java");
        sb.delete(1, 3);
        sb.reverse();
        System.out.println(sb);

    }

}
