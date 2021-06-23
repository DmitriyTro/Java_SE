package Lesson3;

public class Human {
	String name;
	Car3 car;
	BankAccount bA;

	void info() {
		System.out.println("Name: " + name + ',' + " Color car: " + car.color + ',' + " Balance bank account: " + bA.balance + '.');
	}
}

class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "David";
		h.car = new Car3("Red", "V8");
		h.bA = new BankAccount(18, 200.5);
		h.info();
	}
}

class Car3 {
	String color;
	String engine;

	Car3(String color, String engine) {
		this.color = color;
		this.engine = engine;
	}
}

class BankAccount {
	int id;
	double balance;

	BankAccount(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
}
