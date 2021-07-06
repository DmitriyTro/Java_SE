package Lesson21;

public class Penguin extends Bird {

	public Penguin() {
	}

	public Penguin(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("Penguin lyubit est ribu!");
	}

	@Override
	public void sleep() {
		System.out.println("Penguiny spyat prijavshis drug k drugu!");
	}

	@Override
	public void fly() {
		System.out.println("Penguiny ne umeyut letat!");
	}

	@Override
	public void speak() {
		System.out.println("Penguiny ne umeyut pet kak solovyi!");
	}
}
