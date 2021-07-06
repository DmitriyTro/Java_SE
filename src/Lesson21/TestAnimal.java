package Lesson21;

import javax.lang.model.element.AnnotationMirror;

public class TestAnimal {
	public static void main(String[] args) {
		Mechenosec mechenosec = new Mechenosec("Karl");
		System.out.println(mechenosec.name);
		mechenosec.eat();
		mechenosec.sleep();
		mechenosec.swim();

		System.out.println();

		Speakable sp = new Penguin("Kovalski");
		sp.speak();

		System.out.println();

		Animal animal = new Lev("Leva");
		System.out.println(animal.name);
		animal.eat();
		animal.sleep();

		System.out.println();

		Mammal mammal = new Lev("Timo");
		System.out.println(mammal.name);
		mammal.eat();
		mammal.sleep();
		mammal.run();
		mammal.speak();
	}
}
