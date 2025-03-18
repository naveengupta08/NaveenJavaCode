//Perimeter of Rectangle
import java.util.Scanner;
class PerimeterOfRectangle
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		float length;
		System.out.println("Enetr Length:");
		length=obj.nextFloat();
		float breath;
		System.out.println("Enter Breath:");
		breath=obj.nextFloat();
		System.out.println("Perimeter of Rectangle:"+(length+breath)*2);
	}
}