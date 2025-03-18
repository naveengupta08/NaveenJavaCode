//Input and define Area of Rectangle
import java.util.Scanner;
class AreaOfRectangle1
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		float length;
		System.out.println("Enter Length:");
		length=obj.nextFloat();
		float breath;
		System.out.println("Enter Breath:");
		breath=obj.nextFloat();
		System.out.println("Area of Reactangle:"+(length*breath));
	}
}