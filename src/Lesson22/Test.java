package Lesson22;

public class Test {
	public static void main(String[] args) {
		Employee e = new Doctor(); //up casting
		Employee e1 = new Teacher();
		Employee e2 = new Driver();
		Employee e3 = new Employee();

		System.out.println(((Doctor) e).specialization);
		((Doctor) e).heal();

		Employee[] array = {e, e1, e2, e3};
		for (Employee emp : array) {
			if (emp instanceof Driver) {
				System.out.println(((Driver) emp).carName);
				((Driver)emp).drive();
			}
		}
	}
}

class Employee {
	double salary = 1000;
	String name;
	int age;
	int experience;

	void eat() {
		System.out.println("Eating");
	}

	void sleep() {
		System.out.println("Sleeping");
	}
}

class Doctor extends Employee implements Help_able {
	String specialization;

	void heal() {
		System.out.println("Healing");
	}

	@Override
	public void help() {
		System.out.println("helping");
	}
}

class Teacher extends Employee {
	int students;

	void teach() {
		System.out.println("Teaching");
	}
}

class Driver extends Employee {
	String carName = "BMW";

	void drive() {
		System.out.println("Driving");
	}
}

interface Help_able {
	void help();
}
