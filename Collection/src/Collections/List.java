package Collections;

import java.util.HashMap;
import java.util.HashSet;

public class List {
	public static void main(String[] args) {

		int[] x = { 1, 1, 2, 5, 577, 8, 54 };
		int[] y = new int[x.length];
		int j = 0, count = 0;
		
		for (int i = 0; i < x.length-1; i++) {
			if (x[i]!=x[i+1]) {
				y[j]=x[i];
				j++;
				count++;
				
			}
		}
		
		y[j]=x[x.length-1];
		count++;
		for (int z = 0; z<count; z++) {
			System.out.println(y[z]);
		}

//	 1.	Check Prime: Write a program to check if a given number is a prime number.

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter a number : ");
//		int num = scanner.nextInt();
//		
//		for (int i = 2; i < num; i++) {
//			int prime = 0;
//
//			if (i>1) {
//				for (int j = 1; j <= i; j++) {
//					if (i%j==0) {
//						prime++;
//					}
//				}
//				if (prime==2) {
//					System.out.println(i);
//				}
//			}
//		}

//		if (num > 1) {
//			for (int i = 1; i <= num; i++) {
//				if (num % i == 0) {
//					prime++;
//				}
//			}
//		}
//		if (prime == 2) {
//			System.out.println("yes");
//		} else {
//			System.out.println("No");
//		}
//	 2.	Reverse a Number: Reverse the digits of a given integer.

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter a number : ");
//		int num = scanner.nextInt();
//		int rev=0;
//		while (num>0) {
//			  rev=rev*10+num%10;
//			  num=num/10;
//		}
//		System.out.println(rev);
//	 3.	Palindrome Number: Check if a given number is a palindrome.

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter a number : ");
//		int num = scanner.nextInt();
//		int palindromeNumber=num;
//		int rev=0;
//		while (num>0) {
//			  rev=rev*10+num%10;
//			  num=num/10;
//		}
//		if (palindromeNumber==rev) {
//			System.out.println("yes");
//		} else {
//			System.out.println("No");
//		}
//		System.out.println(rev);

//		26.	Reverse a String: Reverse the characters of a given string without using built-in functions.

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter a string : ");
//		String str = scanner.nextLine();
//		
//		for (int i = str.length()-1; i >=0; i--) {
//			System.out.print(str.charAt(i));
//		}
//		
//		27.	Palindrome String: Check if a given string is a palindrome.

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter a string : ");
//		String str = scanner.nextLine();
//		String rev="";
//		for (int i = str.length()-1; i >=0; i--) {
//			 rev += str.charAt(i);
////			System.out.print(str.charAt(i));
//		}
//		if (str.equals(rev)) {
//			System.out.println("yes");
//			
//		} else {
//			System.out.println("No");
//		}

		// 28. Anagram Check: Determine if two strings are anagrams.

//		String str1="abc";
//		String str2="skks";
//		
//		str1.toLowerCase();
//		str2.toLowerCase();
//		char[] charArray = str1.toCharArray();
//		char[] charArray2 = str2.toCharArray();
//		
//		Arrays.sort(charArray);
//		Arrays.sort(charArray2);
//		boolean equals = Arrays.equals(charArray, charArray2);
//		if (equals) {
//			System.out.println("yes");
//		} else {
//			System.out.println("No");
//		}
//		
//		29.	Count Vowels and Consonants: Count the number of vowels and consonants in a string.

//		String str = "abAcd";
//
//		String regEx = "[AEIOUaeiou]";
//
//		Pattern compile = Pattern.compile(regEx);
////		 Matcher matcher = compile.matcher(str);
//		int vowels = 0;
//		int consonant = 0;
//
//		for (char ch : str.toCharArray()) {
//			Matcher matcher = compile.matcher(String.valueOf(ch));
//
//			if (matcher.matches( )) {
//				vowels++;
//			} else {
//				consonant++;
//
//			}
//		}
//		System.out.println(vowels);
//		System.out.println(consonant);
//		30.	Remove Duplicates: Remove duplicate characters from a string.

//		String str = "aaabbbcccd";
//
//		HashSet<Character> uniq = new HashSet<Character>();
//		HashSet<Character> duplicate = new HashSet<Character>();
//		String uniqCharacter = "";
//		for (Character ch : str.toCharArray()) {
//			if (!uniq.add(ch)) {
//				duplicate.add(ch);
//			}
//		}
//		System.out.println(uniq);
//		System.out.println(duplicate);
//	 for (int i = 0; i <str.length()-1; i++) {
//		if (uniq.add(str.charAt(i))) {
//			uniqCharacter++;
//		}
//	}

//		31.	First Non-Repeated Character: Find the first non-repeated character in a string.

//		32.	Longest Substring Without Repeating Characters: Find the length of the longest substring without repeating characters.
//		33.	Character Frequency: Count the frequency of each character in a string.

//		String str = "aaabbbcccd";
//		
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		for (char ch : str.toCharArray()) {
//			 map.put(ch,map.getOrDefault(ch,0)+1);
//		}
//		for (char c : map.keySet()) {
//			System.out.println(c+" : "+map.get(c));
//		}
//		map.forEach((a,b)->System.out.println(a+":"+b));

//		34.	String Permutations: Generate all permutations of a given string.
//		35.	Reverse Words in a String: Reverse the order of words in a given sentence.
//		36.	String Rotation: Check if one string is a rotation of another.
//		37.	Count Occurrences of a Substring: Count how many times a substring appears in a string.

	}
}
