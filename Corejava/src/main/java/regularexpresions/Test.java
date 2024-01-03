package regularexpresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// 1st way
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean r1 = m.matches();
		
		//2nd way
		boolean r2 = Pattern.compile(".s").matcher("it").matches();
		
		//3rd way
		boolean r3 = Pattern.matches(".s", "as");
		
		System.out.println(r1+" "+r2+" "+r3);
		
		

	}

}
