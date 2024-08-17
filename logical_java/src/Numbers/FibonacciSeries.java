package Numbers;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Scanner to get the number of terms from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of terms
        System.out.println("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Initialize the first two terms
        long a = 0, b = 1;

        // Print the first two terms
        System.out.print(a + " " + b);

        // Generate the Fibonacci series up to n terms
        for (int i = 3; i <= n; i++) {
            long sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }
}
