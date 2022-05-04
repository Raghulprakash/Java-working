package examples.List;

import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		System.out.println(a.isEmpty());
		a.add("A"); 
		a.add("Raghul"); 
		a.add(1); 
		a.add(19.2); 
		a.add(1.078); 
		
        System.out.println("********************************************");
		System.out.println(a);
		a.add(1, "B");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.indexOf(1.078));
		System.out.println(a.size());
		System.out.println(a.contains("A"));
		//a.clear();
		// System.out.println(a);
		// or
		// a.removeAll(a);
		// System.out.println(a);
		// to find empty or not
		System.out.println(a.isEmpty());
		 System.out.println("********************************************");
		// to add as first letters
		a.addFirst("A");
		System.out.println(a);
		// to add as last letter
		a.addLast("A");
		System.out.println(a);
		//get first element
		System.out.println(a.getFirst());
		//get last element
		System.out.println(a.getLast());
		//get the element of a paticular index
		System.out.println(a.get(2));
		// to remove first occureing value
		a.removeFirstOccurrence("A");
		System.out.println(a);
		// to remove last occureing value
		a.removeLastOccurrence("A");
		System.out.println(a);
		
	}
}
