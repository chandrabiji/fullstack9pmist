package innerclasses;

interface One{
	public void m1();
}
public class AnonymousInnerClassDemo {
	
	private static int data = 30;

	public static void main(String[] args) {
		One o = new One() {
			public void m1() {
				System.out.println("Data : "+data);
			}
		};
		o.m1();

	}

}
