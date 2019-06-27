package fundamentals;

public class Seventeen {
	public static void main(String[] ar)
	{
	if(ar.length==0)
	{
	System.out.println("Please enter an integer number");
	}
	else
	{
	int n=Integer.parseInt(ar[0]);
	int i,fact=0;
	if(n==1 || n==0)
	{
	System.out.println(n+" is neither prime nor composite");
	}
	else if(n>=1)
	{
	for(i=1;i<=n;i++)
	{
	if(n%i==0)
	{
	fact++;
	}
	}
	if(fact==2)
	{
	System.out.println(n+" is a prime number");
	}
	else
	{
	System.out.println(n+" is not a prime number");
	}
	}
	}
	}
}
