package Number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A {
	public static void main(String[] args) {
		String str="aaabbbdfg";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] arr = str.toCharArray();
		
		for(char c : arr) {
			if(!map.containsKey(c)) {
				map.put(c,1);
			}else {
				map.put(c, map.get(c)+1);
			}
		}
		
		Map.Entry<Character, Integer> max = null;
		
		for(Map.Entry<Character, Integer> eq : map.entrySet()) {
			if(max==null || eq.getValue().compareTo(max.getValue())>0) {
				max=eq;
			}
		}
		
		if(max!=null) {
			int val = max.getValue();
			List<Character> list = new ArrayList<Character>();
			for(Map.Entry<Character, Integer> m : map.entrySet()) {
				if(m.getValue() == val) {
					list.add(m.getKey());
				}
			}
			System.out.println(list +" with value "+val);
		}else {
			System.out.println("no key");
		}
				
		System.out.println(map);
		
//	 str.chars().mapToObj(c-> (char) c)
//	 			.collect(Collectors.groupingBy(e->e,Collectors.counting()))
//		 		.entrySet()
//		 		.stream()
//		 		.sorted(Map.Entry.<Character,Long>comparingByValue(Collections.reverseOrder()))
//		 		.limit(1)
//		 		.forEach(a->System.out.println(a.getKey()+":"+a.getValue()));
	}

}
