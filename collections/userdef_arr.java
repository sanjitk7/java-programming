import java.util.*;

class Student1{
    int rollno;
    String name;
    int age;

    Student1(int rollno,String name,int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
public class userdef_arr {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1001,"aaa",18);
        Student1 s2 = new Student1(1002,"bbb",20);
        Student1 s3 = new Student1(1003,"ccc",22);

        ArrayList<Student1> aa = new ArrayList<Student1>();
        aa.add(s1);
        aa.add(s2);
        aa.add(s3);
    
        for(Student1 s:aa){
            System.out.println(s.rollno);
        }
    }
}
