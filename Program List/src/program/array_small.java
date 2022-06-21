package program;

public class array_small 
{
	public static void main(String[]args)
	{
		int a[]= {50,2,6,7,9,10};
		int size=a.length;
		int temp;
		System.out.println("size of array="+size);
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
		System.out.println("the small number="+a[size-1]);
	}

}
