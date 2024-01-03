package oops;

class Parent{
	public int a = 10;
	public void m1() {
		System.out.println("From Parent m1 method");
	}
}
class Child extends Parent{
	public int b = 20;
	public void m2() {
		System.out.println("From Child m2 Method");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("A = "+c.a);
		System.out.println("B = "+c.b);
		c.m1();
		c.m2();

	}

}
