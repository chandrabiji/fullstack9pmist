package collectionsex;

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp>{
	public int eid;
	public String ename;
	public double salary;
	public Emp(int eid, String ename, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public int compareTo(Emp e) {
		/*
		 * if(e.eid>eid) { return -1; }else if(e.eid<eid) { return 1; }else { return 0;
		 * }
		 */
		return ename.compareTo(e.ename);
	}
	
}
public class CollectionsSorting {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(98);
		numbers.add(34);
		numbers.add(2);
		ArrayList<Emp> employees = new ArrayList<Emp>();
		employees.add(new Emp(300,"xyz",5000));
		employees.add(new Emp(100,"abc",2000));
		employees.add(new Emp(200,"pqr",3000));
		employees.add(new Emp(400,"zyz",4300));
		System.out.println("--without sorting employee collection ---");
		System.out.println("EID"+" "+"ENAME"+" "+"SALARY");
		System.out.println("----------------------------");
		for(Emp e:employees) {
			System.out.println(e.eid+" "+e.ename+" "+e.salary);
		}
		Collections.sort(numbers);
		for(Integer i:numbers) {
			System.out.println(i);
		}
       System.out.println("---------------------");
       Collections.sort(employees);
       System.out.println("--After sorting employees array --");
       for(Emp e:employees) {
			System.out.println(e.eid+" "+e.ename+" "+e.salary);
		}
	}

}
