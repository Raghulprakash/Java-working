package practice;
import java.util.*;
public class ListIteration {

	public static void main(String[] args) 
	{
		List<Integer> a=new ArrayList <Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
	}

}
