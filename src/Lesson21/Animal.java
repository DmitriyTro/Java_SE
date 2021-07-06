package Lesson21;

public abstract class Animal {
	String name;

	public Animal() {
	}

	public Animal(String name) {
		this.name = name;
	}

	abstract void eat();

	abstract void sleep();
}
