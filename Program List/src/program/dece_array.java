package program;

public class dece_array
{
	public static void main(String[]args)
	{
		int a[]= {40,50,10,60,20};
		int s=a.length;
		int temp;
		System.out.println("the leength of array="+s);
		System.out.print("the given array=");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("the decending array=");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		
	}

}
