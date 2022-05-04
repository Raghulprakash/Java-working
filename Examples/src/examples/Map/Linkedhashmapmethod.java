package examples.Map;
import java.util.*;
public class Linkedhashmapmethod 
{
	int rollno;
	int age;
	int std;
	String name;
	String sec;
	Linkedhashmapmethod(int rollno,int age,int std,String name,String sec)
	{
		this.rollno=rollno;
		this.age=age;
		this.std=std;
		this.name=name;
		this.sec=sec;
	}
	}
class Run {

	public static void main(String[] args)
	{
	Linkedhashmapmethod c1 = new Linkedhashmapmethod(10,12,5,"suresh","A");
	 Linkedhashmapmethod c2 = new Linkedhashmapmethod(11,13,5,"ramesh","A");
	 Linkedhashmapmethod c3 = new Linkedhashmapmethod(12,12,4,"ravi","B");
	 Linkedhashmapmethod c4 = new Linkedhashmapmethod(13,12,4,"chandru","B");
	 
	 List<Linkedhashmapmethod> a = new ArrayList<>();
	 a.add(c1);
	 a.add(c2);
	 a.add(c3);
	 a.add(c4);
	 
	 Linkedhashmapmethod c5 = new Linkedhashmapmethod(14,13,2,"sachin","C");
	 Linkedhashmapmethod c6 = new Linkedhashmapmethod(15,13,2,"naruto","D");
	 List<Linkedhashmapmethod> b = new ArrayList<>();
	 b.add(c5);
	 b.add(c6);
	 a.addAll(b);
	 
	 for(Linkedhashmapmethod s1:a)
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