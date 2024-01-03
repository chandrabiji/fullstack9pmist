package basics;

import java.util.Scanner;

public class ReverseString {

	public String reverse(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; --i) {
			output = output + input.charAt(i);
		}
		return output;
	}

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String ?");
		String input = sc.next();
		String output = obj.reverse(input);
		System.out.println("output = " + output);
		boolean palindrome = input.equals(output);
		if(palindrome) {
			System.out.println("Give String is a Palindrome");
		}else {
			System.out.println("Given String is not a Palindrome ");
		}

	}

}
