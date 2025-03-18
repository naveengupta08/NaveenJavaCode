class rectangle
{
	int length;
	int width;
	rectangle(int a,int b)
	{
		length=a;
		width=b;
	}
	int calculateArea()
	{
		return(length*width);
	}
	public static void main(String[] args)
	{
		rectangle rec=new rectangle(25,15);
		long area=rec.calculateArea();
		System.out.println("Area of rectangle: "+area);
	}
}