package collectionsex;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable hm = new Hashtable();
		hm.put(100, "Chandra");
		hm.put(300, "xyz");
		hm.put(200, "pqr");
		hm.put(400, "abc");
		//hm.put(null, "nnn");
		//hm.put(500, null);
		System.out.println("HashMap Elements are: "+hm);
		System.out.println("200 key Value = "+hm.get(200));
		Set keys = hm.keySet();
		System.out.println("HashMap Key's = "+keys);
		Collection c = hm.values();
		System.out.println("HashMap values = "+c);
		Set<Entry<Integer, String>> entries=hm.entrySet();
		for(Entry<Integer, String> e:entries) {
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		
		

	}

}
