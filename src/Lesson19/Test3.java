package Lesson19;

public class Test3 {

	void increaseSalary(Employee employee) {
		employee.salary = employee.salary + 300;
	}

	public static void main(String[] args) {
		Doctor doc = new Doctor();
		doc.name = "Ivan";
		doc.age = 50;
		doc.experience = 25;
		doc.eat();
		doc.specialization = "surgeon";
		doc.sleep();
		doc.heal();
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

class Doctor extends Employee {
	String specialization;

	void heal() {
		System.out.println("Healing");
	}
}

class Teacher extends Employee {
	int students;

	void teach() {
		System.out.println("Teaching");
	}
}

class Driver extends Employee {
	String carName;

	void drive() {
		System.out.println("Driving");
	}
}
