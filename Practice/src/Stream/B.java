package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class B {
	public static void main(String[] args) {
		List<EmployeeData> asList = Arrays.asList(
				new EmployeeData(1, "sam", 100000, "it"),
				new EmployeeData(2, "ashu", 400000, "hr"),
				new EmployeeData(3, "sumi", 500000, "java"),
				new EmployeeData(4, "pupi", 700000, "react"),
				new EmployeeData(5, "hanu", 900000, "it")
				
				);
		List<EmployeeData> sortedEmployeeSalry = asList.stream().sorted(Comparator.comparingDouble(EmployeeData::getEmployeeSalary).reversed()).collect(Collectors.toList());
		sortedEmployeeSalry.forEach(System.out::println);
		
		//
		List<EmployeeData> sortedEmployeeId = asList.stream().sorted(Comparator.comparing(EmployeeData::getEmpId).reversed()).collect(Collectors.toList());
		sortedEmployeeId.forEach(System.out::println);
		
		
		List<EmployeeData> salryMoreThan500 = asList.stream().filter(a-> a.getEmployeeSalary()>=500000).collect(Collectors.toList());
		salryMoreThan500.forEach(System.out::println);
		
 		//empName as key and department as value(key:value) pair
		Map<String, String> collect = asList.stream().collect(Collectors.toMap(EmployeeData::getEmployeeName, EmployeeData::getEmployeeDepartment));
		collect.forEach((name,department)->System.out.println(name+" : "+department));
	}

}
