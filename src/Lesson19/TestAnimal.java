package Lesson19;

public class TestAnimal {
	public static void main(String[] args) {
		Dog dog = new Dog("Mars");
		System.out.println("Number of paw: " + dog.paw);

		System.out.println();

		Cat cat = new Cat("Timo");
		cat.sleep();
	}
}
