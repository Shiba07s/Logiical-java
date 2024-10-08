package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class A {
	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(
				new Employee(1,"john",5000),
				new Employee(1,"ashu",6000),
				new Employee(1,"shiba",7000)
				);
		
		Map<String, Integer> collect = asList.stream().collect(Collectors.toMap(Employee::getEmpName, Employee::getEmpSalary,(a,b)-> a,LinkedHashMap::new));
		collect.forEach((key,value)->{
			System.out.println(key+" : "+value);
		});
//		System.out.println(collect);
		
//		 Employee employee = asList.stream().sorted(Comparator.comparing(Employee::getEmpSalary).reversed()).skip(1).findFirst().orElseThrow(()-> new RuntimeException("Employee nnot found "));
//		 System.out.println(employee);
		
		
//		asList.forEach(System.out::println);
		
//		try {
//		 Employee employee = asList.stream().sorted(Comparator.comparing(Employee::getEmpSalary).reversed()).skip(1).findFirst().orElseThrow(()-> new RuntimeException("Employee nnot found "));
//		 System.out.println(employee);
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			// TODO: handle exception
//		}
		
	}

}
