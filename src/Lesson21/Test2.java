package Lesson21;

public class Test2 {
	public static void main(String[] args) {
		Help_able h = new Driver();
		Swim_able s = new Driver();
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

class Teacher extends Employee implements Help_able {
	int students;

	void teach() {
		System.out.println("Teaching");
	}

	public void help() {
		System.out.println("The teacher provides assistance");
	}

	public void extinguishTheFire(String s) {
		System.out.println("The teacher puts out a fire with the help of" + s);
	}
}

class Driver extends Employee implements Help_able, Swim_able {
	String carName;
	String abc = "Sscs";

	void drive() {
		System.out.println("Driving");
	}

	public void help() {
		System.out.println("The driver provides assistance " );
	}

	public void extinguishTheFire(String s) {
		System.out.println("The driver puts out a fire with the help of " + s);
	}

	public void swim() {
		System.out.println("The driver is swiming");
	}
}

interface Help_able {

	void help();

	void extinguishTheFire(String string);
}

interface Swim_able {

	void swim();
}