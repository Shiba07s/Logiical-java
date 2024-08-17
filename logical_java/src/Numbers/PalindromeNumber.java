package Numbers;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = scanner.nextInt();

		int palindrome_number = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;  
			num = num / 10;
		}
		System.out.println("Reversed number: " + rev);
		if (palindrome_number == rev) {
			System.out.println(palindrome_number + ": is a palindrome number");
		} else {
			System.out.println(palindrome_number + ": not a palindrome number");
		}
	}

}
