import java.util.Scanner;
class WhileLoopWithMathOperation
{
	public static void main(String[] args)
	{
		int num=1;
		while(num<=5)
		{	if(num%2==0)
				System.out.println("Square:"+(num*num));
			else if(num%2!=0)
				System.out.println("Cube:"+(num*num*num));
			else
				System.out.println("Invalid Number");
			num++;
		}
	}
}