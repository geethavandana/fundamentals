package fundamentals;

public class Ten {
	public static void main(String[] ar)
	{
	
	char ch='A';
	if(ch>=97 && ch<=122)
	{
	System.out.println(ch+"->"+Character.toUpperCase(ch));
	}
	else if(ch>=65 && ch<=90)
	{
	System.out.println(ch+"->"+Character.toLowerCase(ch));
	}
	}

}
