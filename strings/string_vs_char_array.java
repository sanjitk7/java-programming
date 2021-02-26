public class string_vs_char_array{
    public static void main(String[] args) {
        char ch[] = {'a','b','c'};
        
        // String s1 = ch;
        // System.out.println(ch + " " + s1); // Type mismatch: cannot convert from String to char

        String s1 = new String(ch);
        System.out.println(ch + " " +s1); // "garbage" abc

        
        // Difference
        char ss0[] = {'x','y','z'};
        String ss1 = "xyz";
        String ss2 = new String("xyz");

        System.out.println(ss0);
        System.out.println(ss1);
        System.out.println(ss2);


        // for mutating assign to new string

        String ss4 = ss1.concat("123");
        System.out.println(ss4);

        // 
    }
}