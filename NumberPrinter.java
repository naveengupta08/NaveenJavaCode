public class NumberPrinter
{
    public static void main(String[] args)
	{
        for (int i = 1; i <= 50; i++)
		{
            if (i % 3 == 0 && i % 5 == 0)
			{
                System.out.println("TF");
            } else if (i % 3 == 0) {
                System.out.println("T");
            } else if (i % 5 == 0) {
                System.out.println("F");
            } else
			{
                System.out.print("\t"+i);
            }
        }
    }
}
