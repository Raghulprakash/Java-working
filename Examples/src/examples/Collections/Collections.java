package examples.Collections;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.add("E");

		// Different ways to print the array list
		// normal print statement
		System.out.println(a);
		System.out.println();

		/*
		 * for each loop print statement : creating a new variable and each element is
		 * stored in the element in the variable and executes the body of the for-each
		 * loop.
		 */
		for (String L : a) {
			System.out.println(L);
		}
		System.out.println();

//		// while loop print statement
//		
//		ListIterator <String> b = a.listIterator();
//		while (b.hasNext())// Returns true if the iteration has more elements
//		{
//			System.out.println(b.next());// Returns the next element in the iteration.
//			
//		}
//		System.out.println();
//		
//		while (b.hasPrevious())
//		{  
//            System.out.println( b.previous());
//		}
//		Iterator <String> s= a.iterator();
//		System.out.println(" ");
//		while(s.hasNext())
//		{
//			System.out.println(s.next());
//		}
//		System.out.println();
//	    a.add(2,"A");
//	    a.remove(1);
//	   System.out.println(a);
		
		
		ListIterator<String> list = a.listIterator();
		while(list.hasNext()){
			System.out.println(list.next());
		}
		System.out.println(" ");
		while(list.hasPrevious()) {
			System.out.println(list.previous());
		}
		System.out.println(" ");
		Iterator<String> iterator=a.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
