package Lesson21;

public abstract class Fish extends Animal {

	public Fish() {
	}

	public Fish(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void sleep() {
		System.out.println("Vsegda interesno nablyudat, kak spyat ribi!");
	}

	abstract void swim();
}
