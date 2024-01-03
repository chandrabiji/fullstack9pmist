package p1;

public  class A {
	
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;
	static int e = 50;
	volatile int f = 60;
	transient int g = 70;


	public static void main(String[] args) {
		A obj = new A();//instance or object
		System.out.println("A = "+obj.a);
		System.out.println("B = "+obj.b);
		System.out.println("C = "+obj.c);
		System.out.println("D = "+obj.d);
		System.out.println("E = "+e);
	}

}
