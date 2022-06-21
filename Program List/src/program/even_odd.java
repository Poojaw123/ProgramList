package program;

public class even_odd
{
	public static void main(String[]args)
	{
		int a=10;
		int b=45;
		int sum;
		
		System.out.println("Enter the number="+a);
		System.out.println("Enter the number="+b);
		sum=a+b;
		System.out.println("the addition of number="+sum);
		
		if(sum%2==0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
	}

}
