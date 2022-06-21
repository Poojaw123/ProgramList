package program;

public class array_ascending 
{
	public static void main(String[] args)
	{
		int a[]={40,10,80,60,20};
		int s=a.length;
		int temp;
		System.out.println("size of array="+s);
		System.out.print("the given array=");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
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
		System.out.print("the ascending array=");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
	}

}
