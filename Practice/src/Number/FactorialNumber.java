package Number;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int factorialNumber = 1;
		
	
//		way-1: using while loop
//		while (num > 0) {
//			factorialNumber = factorialNumber * num;
//			num--;
//		}
//        System.out.println("Factorial is: " + factorialNumber);
		
		
//		way-2: using for loop
//		for (int i = num; i >=1; i--) {
//			factorialNumber=factorialNumber*i;
//		}
//      System.out.println("Factorial is: " + factorialNumber);

	}

}
