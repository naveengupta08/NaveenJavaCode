class parent
{
	int id=30;
	String nm="Sohan";
	int age=20;
	void getdata()
	{
		System.out.println("Your id is = "+id);
		System.out.println("Your Name= "+nm);
		System.out.println("Your age = "+age);
	}
}
class child extends parent 
{
	int cid = 10003;
	String cnm="Java";
	void display()
	{
		System.out.println("Coustomer id "+cid);
		System.out.println("Coustomer Name = "+cnm);
	}
	void results()
	{
		System.out.println("Your id is = "+id);
		System.out.println("Your Name= "+nm);
		System.out.println("Your age = "+age);
		System.out.println("Coustomer id "+cid);
	  	System.out.println("Coustomer Name = "+cnm);
	}
}
class SingleInheritance
{
	public static void main(String[] args)
	{
		child P=new child();
		P.getdata();
		P.getdata();
		P.display();
		P.results();
	}
}//Program ko dekhiye aur samjhaiye kal to mai btaunga hi