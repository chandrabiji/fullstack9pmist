package collectionsex;

import java.util.PriorityQueue;

public class PriortyQueueDemo {

	public static void main(String[] args) {
		PriorityQueue  pq = new PriorityQueue<>();
		pq.add(98);
	//	pq.add(null);
		pq.add(45);
		pq.add(-5);
		pq.add(10);
		pq.add(98);
		System.out.println("PriorityQueue Elements are: "+pq);
		pq.remove();
		System.out.println("After remove : "+pq);

	}

}
