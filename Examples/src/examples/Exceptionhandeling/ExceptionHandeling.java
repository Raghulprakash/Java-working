package examples.Exceptionhandeling;

public class ExceptionHandeling {

	public static void main(String[] args) {
       // execption handelling
		
	try 
	{
	int i=10/0;	
		
	}catch(Exception e) 
	{
	System.out.println(e.getMessage());	

	}
	 finally
	{
	System.out.println(" end ");	
	}
	try 
	{
	int i=10/5;	
	System.out.println(" done ");	
	}catch(Exception e) 
	{
	System.out.println(e.getMessage());	
	
	}
	finally
	{
	System.out.println(" end ");	
	}
	}
}
