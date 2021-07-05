package Lesson19;

public class Pet extends Animal {
	String name;
	int tail = 1;
	int paw = 4;

	public Pet() {
		System.out.println("I am pet");
		eyes = 2;
	}

	public Pet(String name, int tail, int paw) {
		this.name = name;
		this.tail = tail;
		this.paw = paw;
	}

	protected void run() {
		System.out.println("Pet runs");
	}

	protected void jump() {
		System.out.println("Pet jumps");
	}
}
