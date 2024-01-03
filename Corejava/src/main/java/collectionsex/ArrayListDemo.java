package collectionsex;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(true);
		al.add("Chandra");
		al.add('B');
		al.add(null);
		al.add(-34);
		al.add(34.53);
		al.add(10);
		System.out.println("ArrayList Elements are : "+al);
		ArrayList al2 = new ArrayList();
		al2.add(100);
		al2.add(200);
		al.addAll(al2);
		System.out.println(al.contains("Chandra"));
		System.out.println(al.containsAll(al2));
		System.out.println("No Of Elements = "+al.size());
		al2.clear();
		System.out.println("Second ArrayList after clear :"+al2);
		System.out.println(al2.isEmpty());
		System.out.println("---forward-----");
		ListIterator lt = al.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		
		System.out.println("--Backward---");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
	}

}
