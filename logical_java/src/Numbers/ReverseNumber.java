 package Numbers;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		
//		int rev=0;
//		while(num!=0) {
//			rev=rev*10+num%10;
//			num=num/10;
//			
//		}
//		System.out.println(rev);
//		
		
		//way-2: using stringbuffer
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());

		//way-2: using stringbuilder
		 StringBuilder stringBuilder = new StringBuilder(String.valueOf(num));
		System.out.println(stringBuilder.reverse());
	}
}
