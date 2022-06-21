package program;
//22) reverse array

public class array_reverse 
{
	public static void main(String[]args)
	{
		int a[]= {10,20,30,40,50};
		String []b= {"shri","swami","samrth"};
		int s=a.length;
		System.out.println("size of array is="+s);
		System.out.print("the given array is= ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
		System.out.print("the reverse array is= ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+",");
		}
		
		
	
	}

}
