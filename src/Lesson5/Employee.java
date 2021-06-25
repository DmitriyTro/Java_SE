package Lesson5;

public class Employee {
	public double salary;
	protected String name;
	String surname;
	private int age;

	public void doubleSalary() {
		System.out.println("Double salary: " + salary * 2);
	}

	public Employee(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee emp = new Employee(500);
		System.out.println(emp.salary);
		emp.doubleSalary();
	}
}