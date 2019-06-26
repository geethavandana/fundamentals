package fundamentals;

public class Nine {
	public static void main(String[] ar)
	{
	int age=Integer.parseInt(ar[1]);
	if(ar[0].equals("female"))
	{
	if(age>=1 && age<=58)
	{
	System.out.println("The percentage of interest is 8.2%");
	}


	else if(age>=59 && age<=100)
	{
	System.out.println("The percentage of interest is 9.2%");
	}
	}
	else if(ar[0].equals("male"))
	{
	if(age>=1 && age<=58)
	{
	System.out.println("The percentage of interest is 8.4%");
	}
	else if(age>=59 && age<=100)
	{
	System.out.println("The percentage of interest is 10.5%");
	}
	}
	}

}
