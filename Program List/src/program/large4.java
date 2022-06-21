package program;

public class large4 
{
	public static void main(String[]args)
	{
		int a,b,c,d;
		a=100;b=200;
		c=500;d=80;

		System.out.println("Enter a="+a);
		System.out.println("Enter b="+b);
		System.out.println("Enter c="+c);
		System.out.println("Enter d="+d);
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("a is large");
				}
				else
				{
					System.out.println("d is large");
				}
			}
		}
		else if(b>c)
		{
			if(b>d)
			{
				System.out.println("b is large");
			}
			else
			{
				System.out.println("d is large");
			}
		}
		else if(c>d)
		{
			System.out.println("c is large");
		}
		else
		{
			System.out.println("d is large");
		}
		
	}

}
	


