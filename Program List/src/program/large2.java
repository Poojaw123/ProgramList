package program;
//find lage number from 3 number
public class large2 
{
	public static void main(String[]args)
	{
		int a,b,c;
		a=1000;
		b=200;
		c=50;
		System.out.println("enter a="+a);
		System.out.println("enter b="+b);
		System.out.println("enter c="+c);
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is large");
			}
			else
			{
				System.out.println("c is large");
			}
			
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is large");
			}
			else
			{
				System.out.println("c is large");
			}
		}
		
	}

}
