package string_builder;

public class string_builder3 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Welcome");
        sb.replace(1, 3, "Java");
        System.out.println(sb);

    }

}
