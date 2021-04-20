public class nested_try_catch {
    public static void main(String ar[]) {
        try {
            try {
                String s = "helo";
                int a = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("\nNumber format:" + e);
            }
            try {
                // int b = 3/0;
                int a[] = new int[5];
                a[5] = 100;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nArray index: " + e);
            }
        } catch (Exception e) {
            System.out.println("General exeception.....");
        }
        System.out.println("\nprogram continues...");
    }
}
