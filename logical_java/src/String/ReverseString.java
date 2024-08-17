package String;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
//		String str = "Ashutosh";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name : ");
		 String str = scanner.next();

//		way-1
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();

//		way-2
		StringBuffer stringBuffer = new StringBuffer();
		StringBuffer append2 = stringBuffer.append(str);
		
		//for repeatting the string
		StringBuffer repeat = stringBuffer.repeat(append2, 3);

		StringBuffer append = append2.reverse();
		System.out.println(append);
		System.out.println(repeat);

//		way-3
		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder append3 = stringBuilder.append(str);
		StringBuilder append4 = append3.reverse();
		System.out.println(append4);
	}

}
