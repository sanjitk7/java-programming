import java.util.StringTokenizer;
import java.util.Scanner;
public class tokeniser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(s.nextLine(),"@."); // @ and . are delimiters

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }   
        s.close();
    }
    
}
