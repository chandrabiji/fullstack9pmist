package regularexpresions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Yout Student Number?");
		String sno = sc.next();
		while(!Pattern.matches("[0-9]{4}", sno)) {
			System.err.println("Please Enter Student Number must be 4 digts ");
			sno = sc.next();
		}
		System.out.println("Enter Student Name ?");
		String sname = sc.next();
		while(!Pattern.matches("[A-Za-z]*", sname)) {
			System.err.println("Please Enter Student Name must be Characters ");
			sname = sc.next();
		}
		System.out.println("Enter Student Mobile Number ?");
		String mno = sc.next();
		while(!Pattern.matches("\\d{10}", mno)) {
			System.err.println("Please Enter Student Mobile must be 10 digits");
			mno = sc.next();
			
		}
		System.out.println("Student Id     :   "+Integer.parseInt(sno));
		System.out.println("Student Name   :   "+sname);
		System.out.println("Student Mobile :   "+Long.parseLong(mno));

	}

}
