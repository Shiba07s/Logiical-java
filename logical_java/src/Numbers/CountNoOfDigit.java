package Numbers;

import java.util.Scanner;

public class CountNoOfDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		long num = scanner.nextLong();
		
		int count=0;
		while (num>0) {
			num=num/10;
			count=count+1;
		}
		System.out.println("count the number: "+count);
	}
}
