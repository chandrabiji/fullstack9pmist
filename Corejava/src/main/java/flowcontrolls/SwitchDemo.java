package flowcontrolls;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------");
		System.out.println("|   Operations Menu     |");
		System.out.println("-------------------------");
		System.out.println("|  1. ADD               |");
		System.out.println("|  2. SUB               |");
		System.out.println("|  3. MUL               |");
		System.out.println("|  4. DIV               |");
		System.out.println("--------------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		System.out.println("Enter A value ?");
		int a = sc.nextInt();
		System.out.println("Enter B value ?");
		int b = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Result = " + (a + b));
			break;
		case 2:
			System.out.println("Result = " + (a - b));
			break;
		case 3:
			System.out.println("Result = " + (a * b));
			break;
		case 4:
			System.out.println("Result = " + (a / b));
			break;
		default:
			System.out.println("Please select your choice range 1-4 only");

		}

	}

}
