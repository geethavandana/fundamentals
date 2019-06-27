package fundamentals;

public class Twentyone {
	public static void main(String[] ar)
	{
	if(ar.length==0)
	{
	System.out.println("Please enter an integer number");
	}
	else
	{
	int n=Integer.parseInt(ar[0]);
	int r,sum1=0,sum2;
	sum2=n;
	while(n>0)
	{
	r=n%10;
	sum1=sum1*10+r;
	n=n/10;
	}
	if(sum1==sum2)
	{
	System.out.println(sum2+" is a palindrome");
	}
	else
	{
	System.out.println(sum2+" is not a palindrome");
	}
	}
	}
}
