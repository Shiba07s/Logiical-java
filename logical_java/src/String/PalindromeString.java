package String;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string : ");
		String str = scanner.next();

		String palindrome_string = str;
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
//			 System.out.print(str.charAt(i));

		}

		System.out.println(rev);
		if (palindrome_string.equals(rev)) {
			System.out.println(palindrome_string + ": this is the palindrome string");
		} else {
			System.out.println(palindrome_string + ": this is the not palindrome string");

		}
	}

}
