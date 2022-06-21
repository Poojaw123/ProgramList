package program;

public class reverse 
{
	public static void main(String[]args)
	{
		int a[]= {10,20,50,45,70};
		int s=a.length;
		System.out.println("size of array="+s);
		System.out.println("the given array=");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+",");
		}
		
		System.out.println();
		System.out.println("the reverse array=");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+",");
		}
	
	
	}
	

}
