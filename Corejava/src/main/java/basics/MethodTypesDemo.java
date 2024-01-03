package basics;

public class MethodTypesDemo {
	
	public void greet() {
		System.out.println("Hello Welcome to java");
	}
	
	public int add(int i, int j) {
		return i+j;
	}
	
	public static void display() {
		System.out.println("From static method");
	}

	public static void main(String[] args) {
		MethodTypesDemo obj = new MethodTypesDemo();//Instance or Object
		obj.greet();
		System.out.println(obj.add(10, 5));
		display();

	}

}
