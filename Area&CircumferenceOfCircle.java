import java.util.Scanner;
class area
{
	Scanner obj=new Scanner(System.in);
	float radius;
	System.out.print("Enter Radius:");
	radius=obj.nextFloat();
	System.out.print("Area of Circle:"+(3.14*radius*radius));
}
class Perimeter
{
	Scanner obj=new Scanner(System.in);
	float radius;
	System.out.print("Enter Radius:");
	radius=obj.nextFloat();
	System.out.print("Perimeter of Circle:"+(2*3.14*radius));
}
class Area&CircumferenceOfCircle
{
	public static void main(String[] args)
	{
		area a=new area();
		Perimeter p=new Perimeter();
		a.area();
		p.Perimeter();
	}
}