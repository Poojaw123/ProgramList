package program;

public class armstrong
{
	public static void main(String[]args)
	{
	int num=370;
	int temp=num,r;
	int sum=0;
	
	while(num>0)
	{
		r=num%10;
		sum=sum+(r*r*r);
		num=num/10;
		System.out.println(num);
	}
	if(temp==sum)
	{
		System.out.println("armstrong");
	}
	else
	{
		System.out.println("no armstrong");
	}
	
}
}
