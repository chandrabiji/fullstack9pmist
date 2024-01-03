package flowcontrolls;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A, B and C values ?");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if((a>b)&&(a>c)) {
			System.out.println("A value is Big");
		}else if((b>a)&&(b>c)) {
			System.out.println("B value is Big");
		}else if((c>a)&&(c>b)) {
			System.out.println("C value is Big");
		}else {
			System.out.println("Any two or three values are equals");
		}
	}

}
