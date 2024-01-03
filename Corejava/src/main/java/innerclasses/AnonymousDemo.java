package innerclasses;

//Functional Interface: A interface is having one and only one method
@FunctionalInterface
interface Demo{
	public void m1();
}
interface Hello{
	public void sayHello(String name);
}
interface Addition{
	public int add(int a,int b);
}
public class AnonymousDemo {

	public static void main(String[] args) {
		Demo d = ()->System.out.println("Demo Interface m1 method implementation");
		d.m1();
		Hello h = (name)-> System.out.println("Welcome to java 8 examples Mr. "+name);
		h.sayHello("Chandra");
		Addition ad = (a, b)->a+b;
		System.out.println(ad.add(10, 20));
	}

}
