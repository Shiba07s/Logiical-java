package Number;

import java.util.Scanner;

public class CountNumerOfEvewnAndOddDigit {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int even=0 ;
		int odd=0;
		while (num>0) {
			if (num%2==0) {
				even++;
			} else {
				odd++;
			}
			num=num/10;
		}
		
		System.out.println("count the even number : "+even);
		System.out.println("count the odd number : "+odd);
	}

}
