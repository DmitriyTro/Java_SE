package Lesson26;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Car {
	String model;
	String color;
	double engine;

	public Car(String model, String color, double engine) {
		this.model = model;
		this.color = color;
		this.engine = engine;
	}

	public String toString() {
		return "Our car is: " + model + ", color is: " + color + " and engine: " + engine;
	}
}

class Test11 {

	public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
		ArrayList<Car> aL = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			aL.add(carSupplier.get());
		}
		return aL;
	}

//	public static void changeCar(Car car, Consumer<Car> consumer) {
//		consumer.accept(car);
//	}

	public static void main(String[] args) {
		ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "silver metalic", 1.6));
		System.out.println("Our cars: " + ourCars);

//		changeCar(ourCars.get(0), car -> {
//			car.color = "red";
//			car.engine = 2.4;
//			System.out.println("Updated car: " + car);
//		});

		Consumer<Car> consumer = car -> {
			car.color = "red";
			car.engine = 2.4;
			System.out.println("Updated car: " + car);
		};
		consumer.accept(ourCars.get(0));

		System.out.println("Our cars: " + ourCars);
	}
}