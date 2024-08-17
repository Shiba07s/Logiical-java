package String;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
//		String str="shiba";
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name: ");
		String str = scan.next();
		char charAt = str.charAt(0);
//		System.out.println("aaaa : "+charAt);

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

//		using for loop find the character
//		for (int i = 0; i <str.length(); i++) {
//			System.out.println("using for loop find the character: "+str.charAt(i));
//			
//		}

//		using for loop find the character using toCharArray meyhod
//		char[] charArray = str.toCharArray();
//		for (int i = 0; i < charArray.length; i++) {
//			char c = charArray[i];
//			System.out.println("using for loop find the character using toCharArray meyhod: "+c);
//			
//		}

//		String upperCase = str.toUpperCase();
//		String lowerCase = str.toLowerCase();
//		
//		System.out.println("for upper case letter :"+upperCase);
//		System.out.println("for lower case letter :"+lowerCase);
	}

}
