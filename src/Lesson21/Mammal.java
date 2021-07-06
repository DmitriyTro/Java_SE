package Lesson21;

public abstract class Mammal extends Animal implements Speakable {

	public Mammal() {
	}

	public Mammal(String name) {
		super(name);
		this.name = name;
	}

	abstract void run();
}
