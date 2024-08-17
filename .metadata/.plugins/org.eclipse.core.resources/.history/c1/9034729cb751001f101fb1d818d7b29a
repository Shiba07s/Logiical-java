package Number;

import java.util.Scanner;

public class OneTo100PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the number : ");
		int num = scanner.nextInt();
	

		for (int i = 0; i < 100; i++) {
			int primeNumber = 0;
			if (i>1) {
				for (int j = 1; j <=i; j++) {
					if (i%j==0) {
						primeNumber++;
					}
				}
				if (primeNumber==2) {
					System.out.println(i);
				}
			}
		}
	}

}
