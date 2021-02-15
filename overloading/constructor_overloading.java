//CONSTRUCTOR CREATION AND OVERLOADING 

class Area{
    float a=0,b=0;
    public Area(float a,float b){
        System.out.println("Area of Rectangele is  = "+a*b);
    }
    public Area(float a){
        System.out.println("Area of square is = "+a*a);
    }

    public Area(float a,float pi,float x)
    {
        System.out.println("Area of circle is = "+pi*a*a);
    }

    void display(){
        System.out.println("a="+a+"\n");
        System.out.println("b="+b);
    }


}

public class constructor_overloading {
    public static void main(String[] args) {
        Area a = new Area(3);
        a.display();

    }
}