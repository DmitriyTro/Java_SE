package Lesson9;

public class Employee {
	public String name;
	public double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void increaseSalary() {
		salary = salary * 2 + 50;
	}

	public double increaseSalary(double a) {
		return a *= 2;
	}
}

	class EmployeeTest {
		public static void main(String[] args) {
			Employee emp = new Employee("Ivan", 100.55);
			System.out.println(emp.salary);
			System.out.println(emp.increaseSalary(emp.salary));
			System.out.println(emp.salary);
			emp.increaseSalary();
			System.out.println(emp.salary);
		}
	}
