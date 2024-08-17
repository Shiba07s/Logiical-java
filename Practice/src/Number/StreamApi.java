package Number;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApi {
	public static <E> void main(String[] args) {
		
		
//		Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		List<Integer> collect = list.stream().filter(n-> n%2==0).collect(Collectors.toList());
//		List<Integer> collectt = list.stream().filter(n-> n%2!=0).collect(Collectors.toList());
//		System.out.println(collect);
//		System.out.println(collectt);
		
//		2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
//        List<String> collect = myList.stream()
//        	  .map(a-> String.valueOf(a))
//        	  .filter(b-> b.startsWith("1"))
//        	  .collect(Collectors.toList());
//        System.out.println(collect);

//		3. How to find duplicate elements in a given integers list in java using Stream functions?
		
//		List<Integer> myList = Arrays.asList(10,15,10,15,8,49,25,98,32);
//		Set<Integer> hashSet = new HashSet<>(myList);
//		List<Integer> collect = myList.stream().collect(Collectors.toList());
//		System.out.println(collect);
//			  .distinct()
//			  .forEach(System.out::print);
//		myList.stream()
//		.filter(a-> !hashSet.add(a))
//		.forEach(System.out::print);
//		4. Given the list of integers, find the first element of the list using Stream functions?
//		List<Integer> myList = Arrays.asList(10,15,10,15,8,49,25,98,32);
//		myList.stream()
//		  	  .findFirst()
//		  	  .ifPresent(System.out::print);
		
//		5. Given a list of integers, find the total number of elements present in the list using Stream functions?
		
//		List<Integer> myList = Arrays.asList(10,15,10,15,8,49,25,98,32);
//		long count = myList.stream().count();
//		System.out.println(count);
//		System.out.println(myList.toArray().length);
		
//		6. Given a list of integers, find the maximum value element present in it using Stream functions?
//		List<Integer> myList = Arrays.asList(10,15,10,15,8,49,25,98,32);
//		myList.stream().sorted(Collections.reverseOrder()).distinct().limit(1).forEach(System.out::print);
//		 Integer max = myList.stream().max(Integer::compareTo).get();
//		System.out.println(max);
		
//		7. Given a String, find the first non-repeated character in it using Stream functions?
//	    String input = "Java articles are Awesome";
	     
	    
//	    input.chars().mapToObj(c->(char)c)
//		 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//		 .entrySet()
//		 .stream()
//		 .filter(a->a.getValue()==1)
//		 .distinct().limit(1).forEach(System.out::print);
	    
//	  Character firstNonRepeatedChar=input.chars().mapToObj(c->(char)c)
//					 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//					 .entrySet()
//					 .stream()
//					 .filter(a->a.getValue()==1)
// 					 .map(Map.Entry::getKey)
//					 .findFirst().orElse(null);
//	    
//
//        // Output the result
//        if (firstNonRepeatedChar != null) {
//            System.out.println("The first non-repeated character is: " + firstNonRepeatedChar);
//        } else {
//            System.out.println("No non-repeated character found.");
//        }
//					 .forEach(System.out::println);
	    
//		8. Given a String, find the first repeated character in it using Stream functions?
	    
//	    String input = "Java articles are Awesome";
//	    String input = "Java";
//
//	    Set<Character> set=new HashSet<Character>();
//	    Set<Character> duplicate=new HashSet<Character>();
//	    for (Character ch : input.toCharArray()) {
//	    	 if (!set.add(ch)) {
//	 			duplicate.add(ch);
//	 		}  
//		}
//	    System.out.println("Unique characters : " + set);
//        System.out.println("Duplicate characters : " + duplicate);
//
//	    
//	     List<Character> collect = input.chars().mapToObj(c-> (char)c).filter(a->!set.add(a)).limit(1).collect(Collectors.toList());
//	    System.out.println(collect);
		
//		9. Given a list of integers, sort all the values present in it using Stream functions?
		
//		List<Integer> myList = Arrays.asList(10,15,10,15,8,49,25,98,32);
//		List<Integer> collect = myList.stream().sorted().collect(Collectors.toList());
//		System.out.println(collect);
		
//		10. Given a list of integers, sort all the values present in it in descending order using Stream functions?
		
//		List<Integer> myList = Arrays.asList(10,15,10,15,8,49,25,98,32);
//		List<Integer> collect = myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//		System.out.println(collect);
		
		
	}

}
