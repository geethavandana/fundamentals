package fundamentals;

public class Eight {
	public static void main(String[] ar)
	{

	char ch='1';
	System.out.printf("%",ch);
	if(ch>=48 || ch<=57)
	{
	System.out.println("Digit");
	}
	else if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
	{
	System.out.println("Alphabhet");
	}
	else
	{
	System.out.println("Special character");
	}
	}

}
