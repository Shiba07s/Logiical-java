/**
 * 
 */
package Number;

import java.util.Scanner;

/**
 * 
 */
public class LargestOf3Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the 1st number is : ");
		int num1 = scanner.nextInt();
		
		System.out.print("enter the 2nd number is : ");
		int num2 = scanner.nextInt();
		
		System.out.print("enter the 3rd number is : ");
		int num3 = scanner.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println("the largest number is : "+num1);
			
		} else if (num2>num3 && num2>num1) {
			System.out.println("the largest number is : "+num2);

		} else{
			System.out.println("the largest number is : "+num3);

		}
	}

}
