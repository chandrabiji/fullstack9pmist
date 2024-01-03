package basics;

public class VariablesTypes {
    //Instance Variables
	int b = 20;
	static int c = 30;
	public static void main(String[] args) {
		VariablesTypes obj = new VariablesTypes();//Instance or Object
		//Local variables: within the method level only declare and use
		int a = 10;
		System.out.println("A = "+a);
		System.out.println("B = "+obj.b);
		System.out.println("C = "+c);

	}
	

}
