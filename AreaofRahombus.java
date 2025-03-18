//Area of Rahombus
import java.util.Scanner;
class AreaofRahombus
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		float base;
		System.out.println("Enter Base:");
		base=obj.nextFloat();
		float height;
		System.out.println("Enter Height:");
		height=obj.nextFloat();
		System.out.println("Area of Rahombus:"+(0.5*base*height));
	}
}