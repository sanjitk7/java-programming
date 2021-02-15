public class loops {
    public static void main(String[] args) {
        for (int i = 0; i<10;i++){
            System.out.println(i);
        }
        int j = 0;
        while(j<10){
            System.out.println(j);
        }

        int c = -1;
        do{
            System.out.println("hi");
            c++;
        } while(c<3);

        int arr[] = new int[10];

        for (int arr_element: arr){
            System.out.println("Number:"+arr_element);
        }

    }
}
