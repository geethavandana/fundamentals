package fundamentals;

public class Sixteen {
	public static void main(String[] ar)
	{
	int i,j,fact=0;
	for(i=10;i<=99;i++)
	{
	fact=0;
	for(j=1;j<=99;j++)
	{
	if(i%j==0)
	{
	fact++;
	}
	}
	if(fact==2)
	{
	System.out.print(i+" ");
	}
	}
	}

}
