package langpack;

import java.util.Objects;

class Emp{
	public int eid;
	public String ename;
	public double salary;
	public Emp(int eid, String ename, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(eid, ename, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return eid == other.eid && Objects.equals(ename, other.ename)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	public String toString() {
		return eid+" "+ename+" "+salary;
	}

}

public class EqualsDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		if(s1==s2) {
			System.out.println("S1 and S2 are Same object");
		}else {
			System.out.println("S1 and S2 are not same");
		}
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		Emp e1 = new Emp(100,"abc",5000);
		Emp e2 = new Emp(100,"abc",5000);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		if(e1.equals(e2)) {
			System.out.println("e1 and e2 are equals");
		}else {
			System.out.println("e1 and e2 are not equals");
		}
		System.out.println(e1);

	}

}
