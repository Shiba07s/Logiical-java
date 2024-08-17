package Number;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the number : ");
		int num = scanner.nextInt();
	
		int count=0;
		if (num>1) {
			for (int i = 1; i <=num; i++) {
				if (num%i==0) {
					count++;
				}
			}
			if (count==2) {
				System.out.println("This is a prime Number : "+num);
			} else {
				System.out.println("This is not a prime Number : "+num);

			}
		}
	}

}
