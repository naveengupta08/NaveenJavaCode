abstract class bike
{
	abstract void speed();
}
public class Anonymousdemo
{
	public static void main(String[] args)
	{
		int s=50;
		bike b=new bike()
		{
			void speed()
			{
				System.out.println("Speed of Bike: "+s+"km/h");
			}
		};
		b.speed();
	}
}