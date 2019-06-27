package fundamentals;

public class Twenty {
	public static void main(String[] ar)
	{
	if(ar.length==0)
	{
	System.out.println("Please enter an integer number");
	}
	else
	{
	int n=Integer.parseInt(ar[0]);
	int r,sum=0;
	while(n>0)
	{
	r=n%10;
	sum=sum*10+r;
	n=n/10;
	}
	System.out.println(sum);
	}
	}

}
