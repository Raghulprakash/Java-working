package examples.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Collection2 {

	public static void main(String[] args)
	{
	 Collections1 c1 = new Collections1(10,12,5,"suresh","A");
	 Collections1 c2 = new Collections1(11,13,5,"ramesh","A");
	 Collections1 c3 = new Collections1(12,12,4,"ravi","B");
	 Collections1 c4 = new Collections1(13,12,4,"chandru","B");
	 
	 List<Collections1> a = new ArrayList<>();
	 a.add(c1);
	 a.add(c2);
	 a.add(c3);
	 a.add(c4);
	 
	 Collections1 c5 = new Collections1(14,13,2,"sachin","C");
	 Collections1 c6 = new Collections1(15,13,2,"naruto","D");
	 List<Collections1> b = new ArrayList<>();
	 b.add(c5);
	 b.add(c6);
	 a.addAll(b);
	 
	 for(Collections1 s1:a)
	 {
		 System.out.println("rollno :"+s1.rollno+" " +"age :"+s1.age+" "+"std :"+s1.std+" "+"name :"+s1.name+" "+"sec :"+s1.sec);
	 }
	 System.out.println(" ");
	 ListIterator c = a.listIterator();
	 while (c.hasNext())
		{  
      System.out.println( c.next());
     
		}
	 System.out.println(" ");
	 while (c.hasPrevious())
		{  
         System.out.println( c.previous());
		}
	 System.out.println(" ");
	}

}

