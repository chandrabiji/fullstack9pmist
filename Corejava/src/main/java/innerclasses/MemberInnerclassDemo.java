package innerclasses;

public class MemberInnerclassDemo {//outer class
	
	private int data = 10;
	
	class InnerClass{ //Inner class
		public void m1() {
			System.out.println("Data "+data);
		}
	}
	
	public void display() {
		InnerClass in = new InnerClass();
		in.m1();
	}

	public static void main(String[] args) {
		MemberInnerclassDemo obj = new MemberInnerclassDemo();
		obj.display();
		MemberInnerclassDemo.InnerClass in = new MemberInnerclassDemo().new InnerClass();
		in.m1();

	}

}
