package innerclasses;

public class MethodLocalInnerClassDemo {
	
	private int data = 20;
	
	public void display() {
		class Inner{
			public void m1() {
				System.out.println("Data : "+data);
			}
		}
		Inner in = new Inner();
		in.m1();
	}

	public static void main(String[] args) {
		MethodLocalInnerClassDemo outer = new MethodLocalInnerClassDemo();
		outer.display();

	}

}
