package basics;

public class StringMethodsDemo {

	public static void main(String[] args) {
	
		String str = new String("Hyderabad");
		System.out.println("Length = "+str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('d'));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.contains("bad"));
		System.out.println(str.substring(6,9));
		String str1 = "   Hello   ";
		System.out.println(str1.trim());
	}

}
