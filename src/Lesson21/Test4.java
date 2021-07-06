package Lesson21;

public class Test4 {
	public static void main(String[] args) {
		Jumpable j1 = new Human();
		Jumpable j2 = new Animal2();
	}
}

class Human implements Jumpable {

}

class Animal2 implements Jumpable {

}

interface Jumpable {

}

interface A2 {

}

interface B2 extends A2, Jumpable {

}

abstract class D2 implements B2 {

}
