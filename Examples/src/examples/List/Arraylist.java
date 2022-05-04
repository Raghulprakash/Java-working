package examples.List;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		System.out.println(a.isEmpty());
		a.add("A");
		a.add("Raghul");
		a.add(1);
		a.add(19.2);
		a.add(1.078);

		System.out.println(a);
		// adding new element using index
		a.add(1, "B");
		System.out.println(a);
		// getting the element of a particular index
		System.out.println(a.get(2));
		// finding the index value of a particular element
		System.out.println(a.indexOf(1.078));
		// finding the size of the array list
		System.out.println(a.size());
		// to find a element present in arraylist
		System.out.println(a.contains("A"));
		// to delete everyting in array list
		// a.clear();
		// System.out.println(a);
		// or
		// a.removeAll(a);
		// System.out.println(a);
		// to find empty or not
		System.out.println(a.isEmpty());

	}

}
