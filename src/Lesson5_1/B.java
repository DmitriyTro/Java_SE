package Lesson5_1;

import Lesson5.Employee;

public class B {
	public static void main(String[] args) {
		Employee emp = new Employee(500);
		System.out.println(emp.salary);
		emp.doubleSalary();
	}
}
