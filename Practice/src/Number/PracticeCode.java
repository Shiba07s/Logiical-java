package Number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PracticeCode {
	public static <E> void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string : ");
		String str = scanner.nextLine();
		
		//anagram string
		
/*		System.out.println("enter the string : ");
		String str1 = scanner.nextLine();
		
		System.out.println("enter the string : ");
		String str2 = scanner.nextLine();
		if (isAnagram(str1,str2)) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}
		private static boolean isAnagram(String str1, String str2) {
			char[] Anagram1 = str1.toCharArray();
			char[] Anagram2 = str2.toCharArray();
			
			Arrays.sort(Anagram1);
			Arrays.sort(Anagram2);
			return Arrays.equals(Anagram1, Anagram2);
		}*/
		
		
		
		
		
//		Substring Check
		
//		 System.out.println("Enter the substring: ");
//	        String str = scanner.nextLine();
//	        System.out.println("Enter the substring: ");
//	        String subStr = scanner.nextLine();
//
//	        if (str.contains(subStr)) {
//	            System.out.println(subStr + " is a substring of " + str);
//	        } else {
//	            System.out.println(subStr + " is not a substring of " + str);
//	        }
		
//		5. Character Frequency
		
//		Map<Character,Integer>map=new HashMap<>();
//		for (char ch : str.toCharArray()) {
//			map.put(ch, map.getOrDefault(ch, 0)+1);
//		}
//		for (char c : map.keySet()) {
//			System.out.println(c+":"+map.get(c));
//		}
		
//		str.chars().mapToObj(c-> (char) c)
//				   .collect(Collectors.groupingBy(a->a,Collectors.counting()))
//				   .forEach((key,value)-> System.out.println(key+" : "+value));
		
		
//		Regular Expression for 10-digit Mobile Number
		
//		String regEx="[\\d]{10}";
//		Pattern pattern = Pattern.compile(regEx);
//		Matcher matcher = pattern.matcher(str);
//		  if (matcher.matches()) {
//	            System.out.println(str + " is a valid 10-digit mobile number.");
//	        } else {
//	            System.out.println(str + " is not a valid 10-digit mobile number.");
//	        }
//	        
//	        scanner.close();
//		
		
//		Regular Expression for valid email
		
//	String regEx="^[\\w]+@[\\w.]+\\.[a-zA-z]{2,4}$";
// 
//		Pattern pattern = Pattern.compile(regEx);
//		Matcher matcher = pattern.matcher(str);
//		
//		if (matcher.matches()) {
//            System.out.println(str + " is a valid email address.");
//        } else {
//            System.out.println(str + " is not a valid email address.");
//        }
		
//		
//		str.toLowerCase().split("\\s");
//		
//		String regEx="\\d";
//		Pattern compile = Pattern.compile(regEx);
//		int sum=0;
////		int numericValue=0;
//		for (Character ch : str.toCharArray()) {
//			Matcher matcher = compile.matcher(String.valueOf(ch));
//			if (matcher.matches()) {
//				sum=sum+Character.getNumericValue(ch);
//			}
//		}
//		System.out.println("numericValue : "+sum);
		
		
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			Matcher matcher = compile.matcher(String.valueOf(ch));
// 			if (matcher.matches()) {
//				sum=sum+Character.getNumericValue(ch);
//			}
// 		}
//		System.out.println("sum  : "+sum);
//		
//		String regEx = "[aaeiou]";
//		
//		int vowel=0,consonant=0;
//		Pattern compile = Pattern.compile(regEx);
////		Matcher matcher = compile.matcher(regEx);
//		
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			
//			Matcher matcher = compile.matcher(String.valueOf(ch));
//			if (matcher.matches()) {
//				vowel++;
//			} else if (ch>='a' && ch<='z') {
//				consonant++;
//
//			}
//		}
//		
//		System.out.println("vowel : "+vowel);
//		System.out.println("consonant : "+consonant);
//		
		
//		String replaceAll = str.replaceAll("\\S", "");
//		int count=0;
//		System.out.println("aaaa"+ replaceAll.length());
//		for (int i = 0; i < replaceAll.length(); i++) {
//			count++;
//		}
//		System.out.println(count);

//		char[] charArray = str.toCharArray();
		
//		int count=0;
//		for (Character c : charArray) {
//			count++;
//			
//		}
//		System.out.println(count);
		
		
//		str = str.toLowerCase().trim();
//		int consonents = 0, vowels = 0;
//
//		for (Character ch : str.toCharArray()) {
//			if (ch >= 'a' || ch <= 'z') {
//				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//					consonents++;
//				} else {
//					vowels++;
//				}
//			}
//		}
//		System.out.println("consonents count is : "+consonents);
//		System.out.println("vowel count is : "+vowels);
//
//		

//        String reversed = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }
//        
//		if (str.equals(reversed)) {
//            System.out.println(str + " is a palindrome.");
//
//		} else {
//            System.out.println(str + " is not a palindrome.");
//
//		}
//		 String reversed = new StringBuilder(str).reverse().toString();
//		 System.out.println(reversed);
//		 
//
//	        if (str.equals(reversed)) {
//	            System.out.println(str + " is a palindrome.");
//	        } else {
//	            System.out.println(str + " is not a palindrome.");
//	        }

//	    int number = scanner.nextInt();

//	    int multiply=1,digit=0;
//
//	    while (number!=0) {
//			digit=number%10;
//			multiply=multiply*digit;
//			number=number/10;
//		}
//	    System.out.println(multiply); 
//	    

//	    int palindromeNumber=number;
//	    int rev=0;
//	    while (number!=0) {
//	    	rev=rev*10+number%10;
//			number=number/10;
//		}
//	    
//	    if (palindromeNumber==rev) {
//			System.out.println("yes : "+palindromeNumber);
//		} else {
//			System.out.println("No : "+palindromeNumber);
//
//		}

//	    int count=0,digit=0;
//	    while (number!=0) {
//			digit=number%10;
//			count=count+digit;
//			number=number/10;
//		}
//	    
//	    System.out.println(count);

//	    System.out.println(count);

//        int originalNumber = number;
//        int sum = 0;
//
//        while (number != 0) {
//            int digit = number % 10;
//            sum += Math.pow(digit, 3);
//            number /= 10;
//        }
//
//        if (sum == originalNumber) {
//            System.out.println(originalNumber + " is an Armstrong number.");
//        } else {
//            System.out.println(originalNumber + " is not an Armstrong number.");
//        }

//		int a=0;
//		int b=1;
//		System.out.print(a+ " "+b);
//		for (int i = 2; i <num; i++) {
//			int third=a+b;
//			
//			a=b;
//			b=third;
//			System.out.print(" "+third);
//		}
//		

//		for (int i = 0; i <num; i++) {
//			int prime = 0;
//
//			if (i>1) {
//				for (int j = 1; j <=i; j++) {
//					if (i%j==0) {
//						prime++;
//					}
//				}
//				if (prime==2) {
//					System.out.println(i);
//				}
//			}
//
//		}

//		int prime = 0;
//		if (num > 1) {
//			for (int i = 1; i <= num; i++) {
//				if (num % i == 0) {
//					prime++;
//				}
//			}
//
//			if (prime == 2) {
//				System.out.println("prime number : " + num);
//			} else {
//				System.out.println("not prime number : " + num);
//			}
//		}

//		double sum = 0;
//		for (int i = 0; i <= num; i++) {
//			sum=sum+i;
//		}
//		System.out.println("Sum of first " + num + " natural numbers is " + sum);

//		double factorial=1;
//		while (num>0) {
//			factorial=factorial*num;
//			num--;
//		}
//		System.out.println(factorial);
//		for (int i = 1; i<=num; i++) {
//			factorial=factorial*i;
//		}
//		System.out.println(factorial);
//	 
//	}
	}


}
