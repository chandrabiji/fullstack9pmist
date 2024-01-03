package exceptions;

public class ThrowsDemo {
	
	public void display() throws ArithmeticException,NullPointerException{
		System.out.println(10/0);
	}

	public static void main(String[] args) {
		ThrowsDemo obj = new ThrowsDemo();
		System.out.println("first line");
		try {
			obj.display();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Last line");

	}

}
