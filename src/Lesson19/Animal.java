package Lesson19;

public class Animal {
	int eyes;

	public Animal() {
		System.out.println("I am animal");
	}

	public Animal(int eyes) {
		this.eyes = eyes;
	}

	protected void eat() {
		System.out.println("Animal eats");
	}

	protected void drink() {
		System.out.println("Animal drinks");
	}
}
