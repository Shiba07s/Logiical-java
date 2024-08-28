package Number;

//import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DigitalOceanLogicalQuestion {
	public static void main(String[] args) {
//	########################	1. How do you reverse a string in Java?#########################

//		String str="ashutosh";

//		Map<Character, Integer> map=new HashMap<Character, Integer>();
//		
//		for (Character ch : str.toCharArray()) {
//			map.put(ch, map.getOrDefault(ch, 0)+1);
//		}
//		for (char c : map.keySet()) {
//			System.out.println(c+" : "+map.get(c));
//		}
//		map.forEach((key,value)-> System.out.println(key+" : "+value));

//		StringBuilder stringBuilder = new StringBuilder(str).reverse();
//		StringBuilder reverse = stringBuilder.reverse();
//		System.out.print(stringBuilder);
//		for (int i = str.length()-1; i >=0; i--) {
//			char charAt = str.charAt(i);
//			System.out.print(charAt);
//		}

//	########################	2. How do you swap two numbers without using a third variable in Java?  ######################

//		int a=100,b=200;
//		
//		System.out.println("before swap a is : "+a+" and b is : "+b);
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("After swap a is : "+a+" and b is : "+b);

//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("After swap a is : "+a+" and b is : "+b);

//	#############	3. Write a Java program to check if a vowel is present in a string.##############

//		String str = "ashutosh";
//		
//		System.out.println(stringContainsVowels("hello"));
//		
//		private static boolean stringContainsVowels(String input) {
//			
//			// TODO Auto-generated method stub
//			return input.toLowerCase().matches(".*[aeiou].*");
//		}
////
//		if (isVowelPresent(str)) {
//			System.out.println("yes");
//		} else {
//			System.out.println("No");
//		}
//	}
//
//	private static boolean isVowelPresent(String str) {
//
//		String regEx = "[aeiouAEIOU]";
//		for (char ch : str.toCharArray()) {
//			if (String.valueOf(ch).matches(regEx)) {
//				return true;
//			}
//			 
//		}
//		return false;
//	}

//	String regEx="[aeiou]";
//	Pattern compile = Pattern.compile(regEx);
//	boolean vowelFound=false;
//	for (char ch : str.toCharArray()) {
//		Matcher matcher = compile.matcher(Character.toString(ch));
//		if (matcher.matches()) {
//			vowelFound=true;
//			break;
//		} 
//		
//	}
//	if (vowelFound) {
//		System.out.println("yes");
//	} else {
//		System.out.println("No");
//	}

//	################	4. Write a Java program to check if the given number is a prime number.##############

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter the number : ");
//		int num = scanner.nextInt();
//		int primeNumber=0;
//		
//		if (!isPrime(num)) {
//			System.out.println("yes");
//		}else {
//			System.out.println("No");
//		}
//		if (num>0) {
//			for (int i = 1; i <=num; i++) {
//				if (num%i==0) {
//					primeNumber++;
//				}
//			}
//		}
//		if (primeNumber==2) {
//			System.out.println("yes");
//		} else {
//			System.out.println("No");
//		}
//		
//		
//	}

//	private static boolean isPrime(int num) {
//		int primeNumber=0;
//		for (int i = 1; i < num; i++) {
//			if (num%i==0) {
//				primeNumber++;
//			}
//		}
//		if (primeNumber==2) {
//			return true;
//		}
//		// TODO Auto-generated method stub
//		return false;
//	}

//		############## 5. Write a Java program to print a Fibonacci sequence using recursion. ################

//		int a=0,b=1;
//		System.out.print(a+" "+b);
//		for (int i = 2; i <10; i++) {
//			int temp=a+b;
//			System.out.print(" "+temp);
//			a=b;
//			b=temp;
//			
//		}
//		System.out.println(LocalDateTime.now());
//		System.out.println(LocalDate.now());
//		System.out.println(LocalTime.now());

//		############ 6. How do you check if a list of integers contains only odd numbers in Java?  ############

//		int[] num = { 1, 2, 3, 4, 5, 6 };
//
////		List<int[]> list = Arrays.asList(num);
//		List<Integer> collect = Arrays.stream(num).boxed().collect(Collectors.toList());
//		List<Integer> collect2 = collect.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());
//		System.out.println(collect2);

//		for (int i = 0; i < num.length; i++) {
//			if (i%2!=0) {
//				System.out.print("odd numbr is : "+i);
//			}
//		}

//	####################	8. How do you remove spaces from a string in Java?   #############

//		String str="hi Am Ashutosh here";
//		String replaceAll = str.replaceAll( "\\s",  "");
//		System.out.println(replaceAll);

//		StringBuilder sb = new StringBuilder();
//		for (char ch : str.toCharArray()) {
//			if (!Character.isWhitespace(ch)) {
//				sb.append(ch);
//			}
//			
//		}
//		System.out.println(sb.toString());

//	#############	9. How do you remove leading and trailing spaces from a string in Java?   ###############
//		String str=" hi Am Ashutosh here ";
//		String trim = str.trim();
//		System.out.println(trim);

//#######################   2nd highest number using array  ############

//		int [] arr= {3,1,3,4,5,5,74,6,6,54,32,9};
//		int max=arr[0];
//		int min=arr[0];
//		int secondMax=arr[0];
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i]>max) {
//				secondMax=max;
//				max=arr[i];
//			}else if (arr[i]>secondMax) {
//				secondMax=arr[i];
//			}
//			else if (arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		 System.out.println("Highest number: " + max);
//		 System.out.println("Lowest number: " + min);
//	     System.out.println("Second highest number: " + secondMax);

		// bubble sort
//		int[] arr = { 3, 1, 3, 4, 5, 5, 74, 6, 6, 54, 32, 9 };
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));

//		2. Reverse an Array
//
//		int[] arr = { 3, 1, 3, 4, 5, 5, 74, 6, 6, 54, 32, 9 };
//
//		reversedArray(arr);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//    }
//
//    private static void reversedArray(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }

		
//		########## is sorted or not  ##############
		
		
//		int[] arr = { 3, 1, 3, 4, 5, 5, 74, 6, 6, 54, 32, 9 };
//		if (isSortedAsc(arr)) {
//			System.out.println("sorted array asc order");
//		} else if (isSortedDesc(arr)) {
//			System.out.println("sorted array desc order");
//
//		} else {
//			System.out.println("not sorted array ");
//
//		}
//
//	}
//	public static boolean isSortedAsc(int[] arr) {
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[1]<arr[i-1]) {
//				return false;
//			}
//		}
//		return true;
//	}
//	public static boolean isSortedDesc(int[] arr) {
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[1]>arr[i-1]) {
//				return false;
//			}
//		}
//		return true;
		
		
//		String str="aaabbbcxc";
//		
//		HashSet<Character> uniq = new HashSet<Character>();
//		HashSet<Character> duplicate = new HashSet<Character>();
//		
//		for (Character ch : str.toCharArray()) {
//			if (!uniq.add(ch)) {
//				duplicate.add(ch);
//			}
//		}
//		
//		System.out.println("uniq : "+uniq);
//		System.out.println("duplicate : "+duplicate);
		
//		int[] arr = { 3, 1, 3, 4, 5, 5, 74, 6, 6, 54, 32, 9 };
//		
//		for (int i = 0; i < arr.length-1; i++) {
//			 for (int j = i+1; j < arr.length; j++) {
//				if (arr[i]>arr[j]) {
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		System.out.println("asc order");
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" , ");
//		}
		
	int[] arr = { 3, 1, 3, 4, 5, 5, 74, 6, 6, 54, 32, 9 };
		
		for (int i = 0; i < arr.length-1; i++) {
			 for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("asc order");
		HashSet<Integer> uniq = new HashSet<Integer>();
		HashSet<Integer> duplicate = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!uniq.add(arr[i])) {
				duplicate.add(arr[i]);
			}
			System.out.print(arr[i]+" , ");
		}
		
		
		
//		for (Integer ch : arr) {
//			if (!uniq.add(ch)) {
//				duplicate.add(ch);
//			}
//		}
//		
		 // Print unique elements
        System.out.print("Unique elements: ");
        for (Integer num : uniq) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print duplicate elements
        System.out.print("Duplicate elements: ");
        for (Integer num : duplicate) {
            System.out.print(num + " ");
        }
        System.out.println();
		
//		  int[] arr = { 3, 1, 3, 4, 5, 5, 74, 6, 6, 54, 32, 9 };
//	        
//	        // Ascending order sorting
//	        for (int i = 0; i < arr.length - 1; i++) {
//	            for (int j = i + 1; j < arr.length; j++) {
//	                if (arr[i] > arr[j]) {
//	                    // Swap arr[i] and arr[j]
//	                    int temp = arr[i];
//	                    arr[i] = arr[j];
//	                    arr[j] = temp;
//	                }
//	            }
//	        }
//
//	        // Printing the array in ascending order
//	        System.out.print("Ascending order: ");
//	        for (int i = 0; i < arr.length; i++) {
//	            System.out.print(arr[i] + " ");
//	        }
//	        System.out.println();
	}
}