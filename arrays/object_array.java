import java.util.Scanner;

class student{
    String regno;
    int[] marks = new int[5];
}
public class object_array {
    public static void main(String[] args) {
        System.out.println("Enter the number of students:\n");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        String sub[] = {"Eng","Math","Phy","Che","Bio"};
        int avg[] = new int[size];
        int best_avg = 0;
        String best_reg = "";
        student[] studentset = new student[size];
        int sum =0;
        for (int j = 0;j<size;j++){
            // Initialise each object after initialising the object array!
            studentset[j] = new student();
            System.out.println("Enter the reg of student"+j+" :\n");
            studentset[j].regno = s.next();
            System.out.println("Enter the marks of student"+j+" :\n");
            for (int i = 0;i<5;i++){
                System.out.println("Enter the marks in "+sub[i]+" :\n");
                studentset[j].marks[i] = s.nextInt();
                sum+=studentset[j].marks[i];
            }
            System.out.println("total of student"+j+" is "+sum);
            System.out.println("average of student"+j+" is "+sum/5);
            avg[j] = sum/5;
            if(avg[j]>best_avg){
                best_avg = avg[j];
                best_reg = studentset[j].regno;
            }
        }
        s.close();
        System.out.println("\nBest Student: "+best_reg);

    }
}
