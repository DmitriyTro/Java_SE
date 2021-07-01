package Lesson14;

public class Car {
	String color;
	String engine;
	final static int A = 5;

	public Car(String color, String engine) {
		this.color = color;
		this.engine = engine;
	}

	public Car abc(String color) {
		Car car = new Car(color, "V4");
		return car;
	}

	public static void main(String[] args) {
		Car c = new Car("red", "V6");
		Car c2 = c.abc("black");

		System.out.println(c.color);









	}
}

//class TestCar {
////	final static Car CAR = new Car ("red", "V8");
////
////	public static void main(String[] args) {
////		CAR.color = "black";
////	}
//}
