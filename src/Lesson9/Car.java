package Lesson9;

import java.sql.SQLOutput;

public class Car {
	String color;
	String engine;
	int numbersOfDoor;

	Car(String color, String engine, int numbersOfDoor) {
		this.color = color;
		this.engine = engine;
		this.numbersOfDoor = numbersOfDoor;
	}
}

class CarTest {

	public void changeNumbersOfDoor(Car car, int numbers) {
		car.numbersOfDoor = numbers;
	}

	public void changeColor(Car car, Car car2) {
		String color = car.color;
		car.color = car2.color;
		car2.color = color;
		System.out.println(car.color);
		System.out.println(car2.color);
	}

	public static void main(String[] args) {
		CarTest carTest = new CarTest();
		Car car = new Car("Black", "V6", 4);
		Car car2 = new Car("Blue", "V8", 5);

		carTest.changeNumbersOfDoor(car, 5);
		carTest.changeColor(car, car2);

		System.out.println();
		System.out.println(car.color + ' ' + car.engine + ' ' + car.numbersOfDoor);
		System.out.println(car2.color + ' ' + car2.engine+ ' ' + car2.numbersOfDoor);
	}
}