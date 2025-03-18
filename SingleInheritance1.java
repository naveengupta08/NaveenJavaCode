class Naveen
{
	void Class()
	{
		System.out.println("My Name is Naveen Kumar");
		System.out.println("My roll no- 25");
	}
}
class Gupta extends Naveen
{
	void College()
	{
		System.out.println("I'm Student of BCA in 4th Sem");
		System.out.println("My College Name is S.N.S. College.");
		System.out.println("Add:- Gyan Babu Chauk, Motihari.");
	}
}
class SingleInheritance1
{
	public static void main(String[] args)
	{
		Gupta N=new Gupta();
		N.Class();
		N.College();
	}
}