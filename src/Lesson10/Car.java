package Lesson10;

import java.util.concurrent.Callable;

public class Car {
	int engine;
	int doorCount;

	public Car(int engine, int doorCount) {
		this.engine = engine;
		this.doorCount = doorCount;
	}
}

class CarTest {
	public static void main(String[] args) {
		Car car = new Car(3, 4);
		Car car2 = new Car(2, 5);

		String s1 = new String("abc");
		String s2 = new String("abc");

		System.out.println(s1.equals(s2));

		if (car.engine > car2.engine) {
			if (car.doorCount > car2.doorCount) {
				System.out.println("Мощность двигателя и колличество дверей у первого автомобиля больше.");
			} else {
				System.out.println("Мощность двигателя у первого автомобиля больше, а колличество дверей меньше.");
			}
		} else {
			System.out.println("Мощность двигателя у первого автомобиля меньше.");
		}
	}
}