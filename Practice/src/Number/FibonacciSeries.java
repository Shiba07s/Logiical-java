package Number;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int a=0, b=1;
		
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < num; i++) {
			int third =a+b;
            System.out.print(" " + third);

			a=b;
			b=third;
			scanner
			.close();
		}
	}

}
