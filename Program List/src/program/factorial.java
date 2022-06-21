package program;

public class factorial 
{
	public static void main(String[] args)
	{
		int n=8;
		int fact=1;
		System.out.println("Enter the Number="+n);
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial="+fact);
	}
	
}
