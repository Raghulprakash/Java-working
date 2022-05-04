package examples.Forloop;

public class Numbers {
	int n=5;
    public void righttriangle() 
    {
    	for (int i=1;i<=n;i++)
    	{
    		int p=1;
    	 for(int j=1;j<=i;j++) 
    	 {
    		System.out.print(p++); 
    	 }
    	 System.out.println();
    	}
    }
    public void rightuppertriangle() 
    {
    	for (int i=1;i<=n;i++)
    	{
    	 int p=1;
    	 for(int j=i;j<=n;j++) 
    	 {
    		System.out.print(p++); 
    	 }
    	 System.out.println();
    	}
    }
    public void leftuppertriangle() 
    {
    	for (int i=1;i<=n;i++)
    	{
    	 int p=1;
    	 for(int j=1;j<=i;j++) 
    	 {
    		System.out.print(" "); 
    	 }
    	 for(int j=i;j<=n;j++) 
    	 {
    		System.out.print(p++); 
    	 }
    	 System.out.println();
    	}
    }
    public void lefttriangle() 
    {
    	for (int i=1;i<=n;i++)
    	{
    	 int p=1;
    	 for(int j=i;j<=n;j++) 
    	 {
    		System.out.print(" "); 
    	 }
    	 for(int j=1;j<=i;j++) 
    	 {
    		System.out.print(p++); 
    	 }
    	 
    	 System.out.println();
    	}
    }
    public void triangle() 
    {
    	
    	for(int i=1,p=1;i<=n;i++,p++)
    	{
    	for(int j=i;j<=n;j++)
    	{
    		System.out.print(" ");
    	}
    	for(int j=1;j<i;j++) 
    	{
    		System.out.print(p);
    	}
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print(p);
    	}
    	System.out.println();
    	}
    }
	public static void main(String[] args) 
	{
     Numbers run = new Numbers();
     run.righttriangle();
     System.out.println(" ");
     run.rightuppertriangle();
     System.out.println(" ");
     run.leftuppertriangle();
     System.out.println(" ");
     run.lefttriangle();
     System.out.println(" ");
     run.triangle();
	}

}
