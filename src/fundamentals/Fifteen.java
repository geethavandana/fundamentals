package fundamentals;

public class Fifteen {
	public static void main(String[] ar)
	{
	int n=Integer.parseInt(ar[0]);
	int i,j,fact=0;
	if(n>=1)
	{
	for(i=1;i<=n;i++)
	{
	if(n%i==0)
	{
	fact++;
	}
	}
	}
	if(fact==2)
	{
	System.out.println("Prime");
	}
	else
	{
	System.out.println("Not Prime");
	}
	}
	
}
