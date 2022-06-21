package program;

public class array_large 
{
	public static void main(String[]args)
	{
		int a[]= {100,20,40,20,60};
		int s=a.length;
		int temp;
		System.out.println("size of array="+s);
		System.out.print("The given array=");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println();
		System.out.println("the largest no is="+a[s-1]);
	}
	

}
