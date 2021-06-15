package Q1;
class Industry {
    String name;
    String code;
    public void admit(String name, String code){
        System.out.println("admit method");
        this.name = name;
        this.code = code;
    }
    public void conductaudit(){
        System.out.println("conductaudit method");
    }
       
    class Department{
        
        Department(int depNo, int noOfEmp, String deptName){
            this.depNo = depNo;
            this.noOfEmp = noOfEmp;
            this.deptName = deptName;
        }

        int depNo, noOfEmp;
        String deptName;
    }
}

public class Q1{
    public static void main(String[] args) {
        Industry i = new Industry();
        i.admit("KY Yarns", "KY01");
        Industry.Department d = i.new Department(01, 100, "Carding");

        // accessing the data
        System.out.println("Name of Industry: "+ i.name);
        System.out.println("Code of Industry: "+ i.code);
        System.out.println("Name of Department: "+ d.deptName);
        System.out.println("Department Number: "+ d.depNo);
        System.out.println("No of Department Employees: "+ d.noOfEmp);
    }
}