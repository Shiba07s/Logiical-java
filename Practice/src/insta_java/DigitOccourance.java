package insta_java;

import java.util.HashMap;

public class DigitOccourance {
	public static void main(String[] args) {
		int num=112;
		String str = Integer.toString(num);
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for (char string : map.keySet()) {
			System.out.println(string+" : "+map.get(string));
		}
//		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(a->a,Collectors.counting()));
//		collect.forEach((key,value)->System.out.println(key+" : "+value));
//		int digitToCount=1;
//		int count=0;
//		
//		String str = Integer.toString(num);
//		
//		for (int i = 0; i < str.length(); i++) {
//			char charValue = str.charAt(i);
//			int numericValue = Character.getNumericValue(charValue);
//			if (numericValue==digitToCount) {
//				count++;
//			}
//		}
//        System.out.println("Digit " + digitToCount + " occurs " + count + " times in the number " + num);
	}

}
