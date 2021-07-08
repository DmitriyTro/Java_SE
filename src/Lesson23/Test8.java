package Lesson23;

public class Test8 {
	public static void main(String[] args) {
//		Animal a = new Animal();
		Lion lion = new Lion();
	}
}

class Animal {

	public Animal() {
		System.out.println("Constructor of Animal");
	}

	static {
		System.out.println("Static init in Animal");
	}

	{
		System.out.println("Non-static init in Animal");
	}
}

class Mammal extends Animal {

	public Mammal() {
		System.out.println("Constructor of Mammal");
	}

	static {
		System.out.println("Static init in Mammal");
	}

	{
		System.out.println("Non-static init in Mammal");
	}
}

class Lion extends Mammal {

	public Lion() {
		System.out.println("Constructor of Lion");
	}

	static {
		System.out.println("Static init in Lion");
	}

	{
		System.out.println("Non-static init in Lion");
	}
}
