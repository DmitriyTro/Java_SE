package Lesson21;

interface Speakable {

	default void speak() {
		System.out.println("Somebody speaks!");
	}
}
