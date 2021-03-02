public class array_init {
    public static void main(String[] args) {
        // single dimentional arr
        int[] arr_single1 = new int[10];
        // int arr_single1[] = new int[10]; // equivalent
        // int []arr_single1 = new int[10]; // equivalent
        int[] arr_single2 = { 34, 56, 78, 34, 23 };

        int[][] arr_multi1 = {{1,2},{1} };
        int[] arr_multi2[] = {{1,2},{1} }; // equivalent
        Scanner s = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            arr_single1[i] = s.nextInt();
        }
    }
}
