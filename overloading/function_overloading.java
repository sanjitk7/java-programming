class areaclass
{
    void area(float x)
    {
        System.out.println("area of the square: "+Math.pow(x, 2));
    }
    void area(float x, float y)
    {
        System.out.println("area of the rectangle: "+x*y);
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("area of the circle: "+z);
    }
}
class function_overloading 
{
     public static void main(String args[]) 
	{
	   areaclass s = new areaclass();
	   s.area(10);
	   s.area(5,10);
	   s.area(5.5);
        }
}