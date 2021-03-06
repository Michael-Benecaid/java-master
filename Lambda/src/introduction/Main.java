package introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// new Thread(() -> {
		// 	System.out.println("Print from runnable");
		// 	System.out.println("This is line 2");
		// 	System.out.format("This is line %d\n", 3);
		// }).start();

		Employee john = new Employee("John", 21);
		Employee tim = new Employee("Tim", 28);
		Employee jack = new Employee("Jack", 32);
		Employee snow = new Employee("Snow", 43);

		List<Employee> employees = new ArrayList<>();
		employees.add(john);
		employees.add(tim);
		employees.add(jack);
		employees.add(snow);
		
		// Collections.sort(employees, new Comparator<Employee>() {

		// 	@Override
		// 	public int compare(Employee employee1, Employee employee2) {
		// 		return employee1.getName().compareTo(employee2.getName());
		// 	}

		// });

		Collections.sort(employees, (employee1, employee2) -> 
			employee1.getName().compareTo(employee2.getName()));

		for(Employee employee: employees){
			System.out.println(employee.getName());
		}

		UpperConcat uc = (s1, s2) -> {
			String result = s1.toUpperCase() + s2.toUpperCase();
			return result;
		};
		String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
		System.out.println(sillyString);

		AnotherClass anotherClass = new AnotherClass();
		String s = anotherClass.doSomething();
		System.out.println(s);
	}

	public final static String doStringStuff(UpperConcat uc, String s1, String s2){
		return uc.upperAndConcat(s1,s2);
	}
}

class CodeToRun implements Runnable {
	@Override
	public void run(){
		System.err.println("Printing from the runnable");
	}
}

class Employee{
	private String name;
	private int age;

	public Employee(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}
}

interface UpperConcat {
	public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
	public String doSomething() {
		UpperConcat uc = (s1, s2) -> {
			System.out.println("The lambda expression is "+ getClass().getSimpleName());
			String result = s1.toUpperCase() + s2.toUpperCase();
			return result;	
		};
		System.out.println("Another class name is "+ getClass().getSimpleName());
		return Main.doStringStuff(uc, "String1", "String2");
	}
	// 	return Main.doStringStuff(new UpperConcat() {
	// 		@Override
	// 		public String upperAndConcat(String s1, String s2) {
	// 			return s1.toUpperCase() + s2.toUpperCase();
	// 		}
	// 	}, "String1", "String2");
	// }
}
