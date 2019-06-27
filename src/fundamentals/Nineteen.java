package fundamentals;

public class Nineteen {
	public static void main(String[] ar)
	{
	if(ar.length==0)
	{
	System.out.println("Please enter an integer number");
	}
	else
	{
	int n=Integer.parseInt(ar[0]);
	int i,j;
	for(i=0;i<n;i++)
	{
	for(j=0;j<=i;j++)
	{
	System.out.print("* ");
	}
	System.out.print("\n");
	}
	}
	}

}
