package Number;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the  number is : ");
		int num = scanner.nextInt();
		
		int rev=0;
		int palindromeNumber=num;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if (palindromeNumber==rev) {
			System.out.println("this is a palindrome number : "+palindromeNumber);
		} else {
			System.out.println("this is not a palindrome number : "+palindromeNumber);

		}
		
		
	}

}
