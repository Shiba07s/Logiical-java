package insta_java;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SumOfDigit {
	public static void main(String[] args) {
		int num=1234;
 		int sum=0;
//		while(num>0) {
//			int digit=num%10;
//			sum=sum+digit;
//			num=num/10;
//			
//		}
//	for (int i = num; i >=0; i--) {
//		int digit=num%10;
//		sum+=digit;
//		num=num/10;
//	}
//		System.out.println(sum);
//		short s1=1;
//		short s2=1;
//		short result=(short) (s1+s2);
//		System.out.println(result);
 	 
// 		int a=5;
// 		boolean result=(a>10) && (a/0==1);System.out.println(result);
 		
 		List<Integer> asList = Arrays.asList(1,2,3,4);
 		List<Integer> collect = asList.stream().map(a->a*a).collect(Collectors.toList());
 		System.out.println(collect);
 	}
	
	

}
