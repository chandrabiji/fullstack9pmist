package collectionsex;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("abc");
		hs.add('c');
		hs.add(true);
		hs.add(null);
		hs.add(10);
		hs.add("sdfg");
		System.out.println("HashSet Elements are : "+hs);
		System.out.println(hs.contains("abc"));
		System.out.println(hs.size());
		HashSet hs1 = new HashSet();
		hs1.add(100);
		hs1.add(200);
		System.out.println("First HashSet Elements : "+hs);
		hs.addAll(hs1);
		System.out.println("After addming First HashSet Elements are: "+hs);
		System.out.println(hs.containsAll(hs1));
		hs1.clear();
		System.out.println("After calling second HashSet Elements are: "+hs1);
		System.out.println(hs1.isEmpty());
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
