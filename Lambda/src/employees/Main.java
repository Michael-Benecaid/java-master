package employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		Employee john = new Employee("John", 21);
		Employee tim = new Employee("Tim", 28);
		Employee jack = new Employee("Jack", 32);
		Employee snow = new Employee("Snow", 43);
		Employee red = new Employee("Red", 35);
		Employee charming = new Employee("Charming", 45);

		List<Employee> employees = new ArrayList<>();
		employees.add(john);
		employees.add(tim);
		employees.add(jack);
		employees.add(snow);
		employees.add(red);
		employees.add(charming);

		// employees.forEach(employee -> {
		// 	System.out.println(employee.getName());
		// 	System.out.println(employee.getAge());
		// });

		printEmployeeByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
		printEmployeeByAge(employees, "\nEmployees less than 30", employee -> employee.getAge() <= 30);

		Random random = new Random();
		Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
		for(int i=0; i< 10 ; i++){
			System.out.println(randomSupplier.get());
		}
	}

	private static void printEmployeeByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
		System.out.println(ageText);
		System.out.println("=====================");
		for(Employee employee: employees){
			if(ageCondition.test(employee)) {
				System.out.println(employee.getName());
			}
		}
	}

}

