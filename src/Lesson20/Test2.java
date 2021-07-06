package Lesson20;

public class Test2 {

//	public Object abc() {
//		return new Doctor();
//	}

	public static void main(String[] args) {
//		Doctor d = new Doctor();
//		Teacher t = new Teacher();
//		Driver dr = new Driver();
//		Employee e = new Employee();

		Employee emp1 = new Doctor();
		System.out.println(emp1.salary);
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		System.out.println(emp1.experience);
		emp1.eat();
		emp1.sleep();

		Employee emp2 = new Teacher();
		Employee emp3 = new Driver();
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
