package examples.Map;

import java.util.*;
public class Maplinkedhashmap {

	public static void main(String[] args) {
		LinkedHashMap a=new LinkedHashMap();
		a.put("Raghul", 1);
		a.put("Ravi", 2);
		a.put(3,"Sachin");
		a.put(4,"Suresh");
		a.put("a",5);
		a.put(6,"b");
		a.put(1.2,7);
		a.put(8,1.3);
	System.out.println(a);
	//a.clear();
	//System.out.println(a);
	System.out.println(a.get("a"));
	System.out.println(a.get("Ravi"));
	System.out.println(a.get(4));
	System.out.println(a.isEmpty());
	System.out.println(a.remove(8));
	System.out.println(a.replace(3, "Sachin", "Run"));
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.containsKey(3));
	System.out.println(a.containsValue("suresh"));
	System.out.println();
	Set s= a.keySet();
	System.out.println(s);
	Collection c= a.values();
	System.out.println(c);
	System.out.println();
	Set s1=a.entrySet();
	System.out.println(s1);
	}

}
