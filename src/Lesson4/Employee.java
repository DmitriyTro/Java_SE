package Lesson4;

// Test constructor overloading
public class Employee {
	int id;
	String surname;
	int age;
	double salary;
	String department;

	public Employee(String surname, int age) {
		this(0, surname, age, 0.0, null);
	}

	protected Employee(int id, String surname, int age) {
		this(id, surname, age, 0.0, null);
	}

	Employee(int id, String surname, int age, double salary, String department) {
		this.id = id;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}
}

class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Ivanov", 25);
		System.out.println(emp.id);
		System.out.println(emp.age);

		Employee emp2 = new Employee("Petrov", 30);
		System.out.println(emp2.surname);
		System.out.println(emp2.age);

		Employee emp3 = new Employee(2, "Sidorov", 33, 40.13, "IT");
		System.out.println(emp3.department);
	}
}