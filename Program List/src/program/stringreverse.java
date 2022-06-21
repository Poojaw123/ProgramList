package program;

public class stringreverse 
{
	public static void main(String[]args)
	{
		String a="automation testing";
		int size=a.length();
		System.out.println(size);
		System.out.println("Enter the given string");
		for(int i=0;i<=size-1;i++)
		{
			char x=a.charAt(i);
			System.out.print(x);
		}
		System.out.println();
		System.out.println("Reverse of string is");
		for(int j=size-1;j>=0;j--)
		{
			char y=a.charAt(j);
			System.out.print(y);
		}
	}

}
