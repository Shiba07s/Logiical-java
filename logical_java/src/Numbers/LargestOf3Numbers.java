package Numbers;

import java.util.Scanner;

public class LargestOf3Numbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the 1st number: ");
		long a = scanner.nextLong();

		System.out.println("enter the 2nd number: ");
		long b = scanner.nextLong();

		System.out.println("enter the 3rd number: ");
		long c = scanner.nextLong();

//		if (a > b && a > c) {
//			System.out.println(a + " is largest number");
//		} else if (b > a && b > c) {
//			System.out.println(b + " is largest number");
//		} else {
//			System.out.println(c + " is largest number");
//
//		}
		
		//Ternary operator
		long largest=a>b?a:b;
		largest=c>largest?c:largest;
		
		System.out.println(largest+" is largest number");

	}

}
