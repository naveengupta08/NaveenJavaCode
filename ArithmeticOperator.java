//Airthematic Operator
import java.util.Scanner;
class ArithmeticOperator
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		float num;
		System.out.println("Enter 1st Number:");
		num=obj.nextFloat();
		float num1;
		System.out.println("Enter 2nd Number:");
		num1=obj.nextFloat();
		char oper;
		System.out.println("Enter Any Arithmetic Operator:");
		oper=obj.next().charAt(0);
		if(oper=='+')
			System.out.println("Addition is:"+(num+num1));
		else if(oper=='-')
			System.out.println("Substraction is:"+(num-num1));
		else if(oper=='*')
			System.out.println("Multiplication is :"+(num*num1));
		else if(oper=='/')
			System.out.println("Division is:"+(num/num1));
		else if(oper=='%')
			System.out.println("Modulus is :"+(num%num1));
		else
			System.out.println("Invalid Arithmetic Operator");
	}
}