package practice;
import java.util.*;
public class Mapiterator {

	public static void main(String[] args) 
	{
	HashMap a = new HashMap();// generic type
	a.put(1,"A");
	a.put(2,"B");
	a.put(3,"C");
	a.put(4,"D");
	a.put(5,"E");
	
	/*for(int id : a.keySet())
	{
	System.out.println("Key: "+id);
	}
	
	System.out.println(" ");
	
	for(String name : a.values())
	{
	System.out.println("Values: "+name);
	}
	
	}*/
	Iterator<Map.Entry> iterator= a.entrySet().iterator();// generic type
	while(iterator.hasNext())
	{
	Map.Entry b =iterator.next();
	System.out.println(b.getKey()+":"+b.getValue());
	}
}
}