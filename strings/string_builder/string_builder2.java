package string_builder;

public class string_builder2 {
    public static void main(String args[])
    {  
        StringBuilder sb=new StringBuilder("Welcome");  
        sb.insert(1,"Java");//now original string is changed  
        System.out.println(sb);
        }  
    
}
