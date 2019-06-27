package fundamentals;

public class Twentytwo {
	public static void main(String[] ar)
	{
	int i=1,count=0;
	while(count<5)
	{
	if(i%2==0 && i%3==0 && i%5==0)
	{
	System.out.print(i+" ");
	count++;
	}
	i++;
	}
	}

}
