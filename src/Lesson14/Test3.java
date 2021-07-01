package Lesson14;

public class Test3 {
	public static void main(String[] args) {
	}
}

class Employee {
	double salary;
	boolean isManager;

	public Employee(double salary, boolean isManager) {
		this.salary = salary;
		this.isManager = isManager;
	}
}

class TestEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee(100.5, true);
		System.out.println("He is manager? " + emp.isManager + " His salary: " + emp.salary);
	}
}