package oops;

abstract class Product{
	public abstract void productOne();
	public void m1() {
		System.out.println("From abstract class m1 method implementation");
	}
}
public class AbstractionDemo extends Product{

	public void productOne() {
		System.out.println("This is Product One");
	}
	public static void main(String[] args) {
		AbstractionDemo obj = new AbstractionDemo();
		obj.m1();
		obj.productOne();
	}

}
