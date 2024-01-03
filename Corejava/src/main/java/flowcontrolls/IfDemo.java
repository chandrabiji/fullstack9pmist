package flowcontrolls;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ?");
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("Given Number is Even Number");
		}else {
			System.out.println("Given Number is Odd Number");
		}
	}

}
