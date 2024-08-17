package Numbers;

import java.util.Scanner;

public class CountNoOfDigitEvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		long num = scanner.nextLong();

		long even = 0;
		long odd = 0;
		while (num > 0) {
			long rem = num % 10;
			if (rem % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			num=num/10;
		}
		System.out.println("count the even number: " + even);
		System.out.println("count the odd number: " + odd);

	}
	 
}
