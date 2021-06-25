package Lesson5;

public class B {
	public static void main(String[] args) {
		Employee emp = new Employee(500);
		System.out.println(emp.salary);
		emp.doubleSalary();
		emp.name = "Mike";
		System.out.println(emp.name);
		emp.surname = "Ivanov";
		System.out.println(emp.surname);
	}
}
