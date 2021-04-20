import java.lang.Integer;

public class multiple_catch {
    public static void main(String[] args) {
        try{
            String s = "hello";
            int a[] = new int[5];
            a[5] = Integer.parseInt(s);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\n Array Index: "+e);
        }catch(NumberFormatException e){
            System.out.println("\n Number Format: "+e);
        }catch(Exception e){
            System.out.println("\n Exception: "+e);
        }
        System.out.println("Program Continues..");
    }
}

// The NF exception is encountered/thrown first during runtime while parsing the code. Therefore it is caught wherever applicable.
