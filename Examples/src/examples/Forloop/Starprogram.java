package examples.Forloop;

public class Starprogram {

	public static void main(String[] args) {
	int number=5;
	for(int i=1;i<number;i++)
	{ 
		int p=1;
		for(int j=i;j<=number;j++)
		{
		System.out.print(" ");	
		}
		for(int j=1;j<i;j++)
		{
		System.out.print(p++);	
		}
		for(int j=1;j<=i;j++)
	    {
			System.out.print(p++);
		}
		System.out.println();
	}
	for(int i=1;i<=number;i++)
	{
		int p=1;
		for(int j=1;j<=i;j++)
		{
		System.out.print(" ");	
		}
		for(int j=i;j<number;j++)
		{
		System.out.print(p++);	
		}
		for(int j=i;j<=number;j++)
	    {
			System.out.print(p++);
		}
		System.out.println();
	}
}
}