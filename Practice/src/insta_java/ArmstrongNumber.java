package insta_java;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number=1853;
		
		if (isArmstrongNumber(number)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	public static boolean isArmstrongNumber(int number) {
		int originalNumber=number;
		int length = String.valueOf(number).length();
		
		int sum=0;
		while (number!=0) {
			int digit=number%10;
			sum+=Math.pow(digit, length);
			number=number/10;
		}
		return sum==originalNumber;
		
	}

}
