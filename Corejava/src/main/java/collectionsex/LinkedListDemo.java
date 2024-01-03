package collectionsex;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList<>();
		ll.add(10);
		ll.add("Chandra");
		ll.add('B');
		ll.add(true);
		ll.add(98.99);
		System.out.println("LinkedList Elements are : "+ll);
		ll.addFirst(100);
		ll.addLast(200);
		System.out.println("After adding elements : "+ll);

	}

}
