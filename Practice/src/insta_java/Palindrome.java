package insta_java;

public class Palindrome {
	public static void main(String[] args) {
		int a=1211;
		int palindromeNumber=a;
		int rev=0;
		while (a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		if (palindromeNumber==rev) {
			System.out.println("yes : " +palindromeNumber);
		} else {
			System.out.println("No : " +palindromeNumber);

		}
	}

}
