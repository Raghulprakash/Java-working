package examples.Set;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		HashSet a = new HashSet(); 
		System.out.println(a.isEmpty());
	    a.add("A");
	    a.add("A");
	    a.add("a");
	    a.add(1);
	    a.add(2);
	    a.add(19.2); 
		a.add(1.078); 
		
		System.out.println(a);
		System.out.println(a.add("B"));
		System.out.println(a.size());
		System.out.println(a.contains("A"));
		//a.clear();
		//System.out.println(a);
		
		
	}


}
