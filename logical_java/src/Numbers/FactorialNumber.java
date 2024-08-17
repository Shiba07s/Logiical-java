package Numbers;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		long num = scanner.nextLong();
		 
		long factorial=1;
		for (long i = num; i >=1; i--) {
			factorial=factorial*i;
		}
		System.out.println("factorial numbers are: "+factorial);
//		for (int i = 1; i <=num; i++) {
//			factorial=factorial*i;
//		}
//		System.out.println("factorial numbers are: "+factorial);
	}
}
