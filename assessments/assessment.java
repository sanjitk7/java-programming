// LAB ASSESSMENT 1 - SANJIT KUMAR - 18BCE0715

import java.util.Scanner;
public class assessment {

    public static void main(String[] args) {
        int n1,n2;
        Scanner s = new Scanner(System.in);
        System.out.println("1.Choose String Elements or 2.Integer Elements:\n");
        int choice = s.nextInt();
        System.out.println("Please Enter the Size of Array 1:");
        n1 = s.nextInt();
        System.out.println("Please Enter the Size of Array 2:");
        n2 = s.nextInt();

        if (choice==1){

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.println("Please Enter the Elements of array 1:");
        for (int i=0;i<n1;i++){
            arr1[i] = s.nextInt();
        }
        System.out.println("Please Enter the Elements of array 2:");
        for (int j=0;j<n2;j++){
            arr2[j] = s.nextInt();
        }
        s.close();

        // finding common elements
        System.out.println("the common elements are:");
        int count=0;
        for(int i = 0;i<n1;i++){
            for (int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr2[j]+" ");
                    count++;
                }
            }
        }
        if (count==0){
            System.out.println("None!");
        }
    } else if(choice==2){
        String[] arr3 = new String[n1];
        String[] arr4 = new String[n2];
        System.out.println("Please Enter the Elements of array 1:");
        for (int i=0;i<n1;i++){
            arr3[i] = s.nextLine();
        }
        System.out.println("Please Enter the Elements of array 2:");
        for (int j=0;j<n2;j++){
            arr4[j] = s.nextLine();
        }
        s.close();

        // finding common elements
        System.out.println("the common elements are:");
        int count=0;
        for(int i = 0;i<n1;i++){
            for (int j=0;j<n2;j++){
                if(arr3[i]==arr4[j]){
                    System.out.print(arr2[j]+" ");
                    count++;
                }
            }
        }
        if (count==0){
            System.out.println("None!");
        }
    }
        
    }
}
