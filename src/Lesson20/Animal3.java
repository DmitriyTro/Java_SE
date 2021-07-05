package Lesson20;

public class Animal3 {

	static String showName() {
		return "some animal";
	}

	void showInfoAboutAnimal() {
		System.out.println("Name of animal: " + showName());
	}
}

class Mouse2 extends Animal3 {

	static String showName() {
		return "Jerry";
	}

	void showInfoAboutMouse() {
		System.out.println("Name of mouse: " + showName());
	}

	public static void main(String[] args) {
		Mouse2 m = new Mouse2();
		m.showInfoAboutAnimal();
		m.showInfoAboutMouse();
	}
}
