package Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {
	public static void main(String[] args) {
		
		String str="pradeep";
		HashSet<Character> hashSet = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();
		
		for (Character c : str.toCharArray()) {
			if (hashSet.add(c)) {
		 		 sb.append(c);

			}
		}
		System.out.println(sb.toString());
	}
//		String str="satya";
//		HashSet<Character> removeCharacter = new HashSet<>();
//		HashSet<Character> duplicates = new HashSet<>();
//		for (Character c : str.toCharArray()) {
//			if (!removeCharacter.add(c)) {
//				duplicates.add(c);
//			}
//		}
//		System.out.println(setToString(duplicates));
//		System.out.println(setToString(removeCharacter));
//	}
//
//	private static String setToString(HashSet<Character> removeCharacter) {
//		// TODO Auto-generated method stub
//		return removeCharacter.stream().map(String::valueOf).collect(Collectors.joining());
//	}

}
