package Lesson3;

import java.awt.event.WindowFocusListener;

public class Employee {
	int id;
	String surname;
	int age;
	double salary;
	String department;

	Employee(int id, String surname, int age, double salary, String department) {
		this.id = id;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	double increaseSalary() {
		salary *= 2;
		return salary;
	}

	void info() {
		System.out.println("Id: " + id + ',' + " Surname: " + surname + ',' + " Age: " + age + ',' +
				" Salary: " + salary + ',' + " Department: " + department + '.');
	}
}

class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "Petrov", 25, 1040.3, "Manager");
		Employee employee2 = new Employee(2, "Ivanov", 30, 1442.3, "Manager");

		employee.increaseSalary();
		System.out.println("New salary employee: " + employee.surname + " : " + employee.salary);

		employee2.increaseSalary();
		System.out.println("New salary employee: " + employee2.surname + " : " + employee2.salary);
	}
}

