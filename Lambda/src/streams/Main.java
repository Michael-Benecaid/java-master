package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import employees.Employee;

public class Main {

	public static void main(String[] args) {
		List<String> someBingoNumbers = Arrays.asList("N40", "N36", "B12", "B6", "G53", "G60", "G49", "G50", "g64", "I26", "I17", "I29", "O71");

		List<String> gNumbers = new ArrayList<>();
		// someBingoNumbers.forEach(number -> {
		// 	if(number.toUpperCase().startsWith("G")){
		// 		gNumbers.add(number);
		// 		//System.out.println(number);
		// 	}
		// });

		// gNumbers.sort((s1, s2) -> s1.compareTo(s2));
		// gNumbers.forEach((s1) -> System.out.println(s1));
		someBingoNumbers.stream().map(String::toUpperCase).filter(s -> s.startsWith("G")).sorted().forEach(System.out::println);

		Stream<String> ioNumbers = Stream.of("I26", "I17", "I29", "O71");
		Stream<String> inNumbers = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
		Stream<String> concatStream = Stream.concat(ioNumbers, inNumbers);
		System.out.println("=====================");
		System.out.println(concatStream.distinct().peek(System.out::println).count());

		System.out.println("=====================");
		Employee john = new Employee("John Dode", 21);
		Employee tim = new Employee("Tim Kily", 28);
		Employee jack = new Employee("Jack Chung", 32);
		Employee snow = new Employee("Snow White", 43);
		
		Department hr = new Department("Human Resources");
		hr.addEmployee(john);
		hr.addEmployee(tim);
		hr.addEmployee(jack);

		Department account = new Department("Accounting");
		account.addEmployee(snow);

		List<Department> departments = new ArrayList<>();
		departments.add(hr);
		departments.add(account);

		departments.stream().flatMap(department -> department.getEmployees().stream()).forEach(System.out::println);

		System.out.println("=====================");
		List<String> sortedString = someBingoNumbers.stream().map(String::toUpperCase).filter(s -> s.startsWith("G")).sorted().collect(Collectors.toList());
		for(String s: sortedString){
			System.out.println(s);
		}

		Map<Integer, List<Employee>> groupByAge = departments.stream()
			.flatMap(department -> department.getEmployees().stream())
			.collect(Collectors.groupingBy(employee -> employee.getAge()));
		
		departments.stream().flatMap(department -> department.getEmployees().stream())
			.reduce((e1, e2) -> e1.getAge() < e2.getAge()? e1 : e2)
			.ifPresent(System.out::println);
	}

}
