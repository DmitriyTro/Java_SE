package Lesson8;

import Lesson6.Car;
import static Lesson6.Student.count;
import Lesson6.*;

public class TestImport {
	public static void main(String[] args) {
		Car car = new Car();
		Lesson7.Car car2 = new Lesson7.Car();
		Student student = new Student("Ivan", 1);
		System.out.println(count);
	}
}

