package Lesson26;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
	String name;
	String department;
	double salary;

	public Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
}

class TestEmployee {

	public void printEmployee(Employee e) {
		System.out.println("Name :" + e.name + ", department: " + e.department + ", salary: " + e.salary);
	}

	public void filtraciyaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> p) {
		for (Employee e : aL) {
			if (p.test(e)) {
				printEmployee(e);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		Employee emp = new Employee("Anna", "IT", 1200);
		Employee emp2 = new Employee("Elena", "Management", 900);
		Employee emp3 = new Employee("Petr", "Engineer", 1000);

		list.add(emp);
		list.add(emp2);
		list.add(emp3);

		TestEmployee tE = new TestEmployee();
		tE.filtraciyaRabotnikov(list, e -> e.department.equals("IT") && e.salary > 200);
		tE.filtraciyaRabotnikov(list,e -> e.name.startsWith("E") && e.salary != 450);
		tE.filtraciyaRabotnikov(list, e -> e.name.equals(e.department));
	}
}
