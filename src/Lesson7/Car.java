package Lesson7;

public class Car {
	int a = 10;
	String color;
	String engine; // instance variable
	static int count; // static variable

	public static void changeA(int b) {
		Car c = new Car("black", "V8"); // local reference
		c.a = b;
	}

	public Car() {
	}

	public Car(String color, String engine) {
		count++;
		this.color = color;
		this.engine = engine;
	}

	public void showColor() {
		System.out.println("Car color: " + color);
		changeColor("red");
	}

	public void changeColor(String color /* parameter variable */) {
		System.out.println("Car color was changed");
		int price = 5000; // local variable
		this.color = color;
		price += 1000;
	}
}
