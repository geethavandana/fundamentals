package fundamentals;

public class Eighteen {
	public static void main(String[] ar)
	{
	if(ar.length==0)
	{
	System.out.println("Please enter a number");
	}
	else
	{
	int n=Integer.parseInt(ar[0]);
	int sum,r;
	for(sum=0;n>0;n/=10)
	{
	r=n%10;
	sum+=r;
	}
	System.out.println(sum);
	}
	}
}
