package Lesson3;

public class Car {
	String color;
	String engine;
	int speed;

	Car(String color, String engine) {
		this.color = color;
		this.engine = engine;
	}

	int accelerator(int speed) {
		this.speed += speed;
		return speed;
	}

	int brake(int speed) {
		this.speed -= speed;
		return speed;
	}

	int speed1() {
		return speed;
	}

	void showInfo() {
		System.out.println("Color: " + color + ',' + " Engine: " + engine + ',' + " Speed: " + speed + '.');
	}
}

class CarTest {
	public static void main(String[] args) {
		Car car = new Car("Yellow", "V6");
		car.speed = 60;

		car.showInfo();
		car.accelerator(10);
		car.showInfo();
		car.brake(50);
		car.showInfo();
	}
}