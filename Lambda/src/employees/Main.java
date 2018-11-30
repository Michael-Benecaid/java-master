package employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		Employee john = new Employee("John Dode", 21);
		Employee tim = new Employee("Tim Kily", 28);
		Employee jack = new Employee("Jack Chung", 32);
		Employee snow = new Employee("Snow White", 43);
		Employee red = new Employee("Red Ellon", 35);
		Employee charming = new Employee("Charming Green", 45);

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

		// Random random = new Random();
		// Supplier<Integer> randomSupplier = () -> random.nextInt(10000);
		// for(int i=0; i< 10 ; i++){
		// 	System.out.println(randomSupplier.get());
		// }

		Function<Employee, String> getLastName = (Employee employee) -> {
			return employee.getName().substring(employee.getName().indexOf(" ") + 1);
		};
		
		Function<Employee, String> getFirstName = (Employee employee) -> {
			return employee.getName().substring(0, employee.getName().indexOf(" "));
		};

		Random random = new Random();
		for(Employee employee: employees){
			if(random.nextBoolean()){
				System.out.println(getAName(getFirstName, employee));
			} else {
				System.out.println(getAName(getLastName, employee));
			}
		}

		Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
		Function<String, String> firstName = name -> name.substring(0, name.indexOf(" "));
		Function chainedFunction = upperCase.andThen(firstName);
		System.out.println(chainedFunction.apply(employees.get(0)));

		BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> {
			return name.concat(" " + employee.getAge());
		};

		String upperName = upperCase.apply(employees.get(0));
		System.out.println(concatAge.apply(upperName, employees.get(0)));
	}

	private static String getAName(Function<Employee, String> getName, Employee employee){
		return getName.apply(employee);
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

