package exceptions;

public class Test {

	public static void main(String[] args) {
		System.out.println("First Line");
		try {
		System.out.println(10/0);
		}catch(Exception  e) {
			//e.printStackTrace();
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			System.err.println("Some problem here");
		}finally {
			System.out.println("--finally--");
		}
		System.out.println("Last Line");

	}

}
