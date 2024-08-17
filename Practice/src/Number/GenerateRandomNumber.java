/**
 * 
 */
package Number;

import java.util.Random;

/**
 * 
 */
public class GenerateRandomNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random random = new Random();
		System.out.println("the random number is : "+random.nextInt());
		System.out.println("the random number is : "+Math.random());

	}

}
