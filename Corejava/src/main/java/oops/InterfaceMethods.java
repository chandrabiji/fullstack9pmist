package oops;

interface First{
	public void m1();//abstract method
	default void m2() {//default method
		System.out.println("java 8 interface default method");
	}
	static void m3() {//static method
		System.out.println("java 8 interface static method");
	}
}
class A implements First{
	public void m1() {
		System.out.println("First interface m1 based on A class implementation");
	}
}
class B implements First{
	public void m1() {
		System.out.println("First interface m1 based on B class implementation");
	}
}
public class InterfaceMethods {

	public static void main(String[] args) {
		A a = new A();//instance of a class
		a.m1();
		a.m2();
		B b = new B();//instance of a class
		b.m1();
		b.m2();
		First.m3();

	}

}
