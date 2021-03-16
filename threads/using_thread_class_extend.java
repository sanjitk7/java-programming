class Ex extends Thread{
    int a;
    Ex(int b){
        a = b;
    }
    synchronized public void run(){ // remove sync and check
        for (int i=1;i<=10;i++){
            System.out.println(i*a);
        }
    }
}

public class using_thread_class_extend{
    public static void main(String[] args) {
        Ex obj1 = new Ex(2);
        Ex obj2 = new Ex(6);
        obj1.start();
        obj2.start();

    }
}
// overlapping without the synchronised kw