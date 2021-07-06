package Lesson21;

public abstract class Figura {
	int kolichestvoStoron = 0;

	abstract void perimeter();

	abstract void ploshad();

	void showInfo() {
		System.out.println("Eto figura");
	}
}

class Kvadrat extends Figura {
	int kolichestvoStoron = 4;
	int storona1 = 10;

	@Override
	public void perimeter() {
		System.out.println("Perimeter kvadrata = " + 4 * storona1);
	}

	@Override
	void ploshad() {
		System.out.println("Ploshad kvadrata = " + storona1 * storona1);
	}
}

class Pryamougolnik extends Figura {
	int kolichestvoStoron = 4;
	int storona1 = 8;
	int storona2 = 5;

	@Override
	void perimeter() {
		System.out.println("Perimeter pryamougolnika = " + 2 * (storona1 + storona2));
	}

	@Override
	void ploshad() {
		System.out.println("Perimeter pryamougolnika = " + storona1 * storona2);
	}
}

class Okrujnost extends Figura {
	int kolichestvoStoron = 0;
	int radius = 3;

	@Override
	void perimeter() {
		System.out.println("Perimeter okrujnosti = " + 2 * 3.14 * radius);
	}

	@Override
	void ploshad() {
		System.out.println("Perimeter okrujnosti = " + 3.14 * radius * radius);
	}
}

abstract class Chetirehugolnik extends Figura {

	void def() {
		System.out.println("Eto chetirehugolnik");
	}
}

class Test1 {
	public static void main(String[] args) {
		Figura f1 = new Kvadrat();
		System.out.println(f1.kolichestvoStoron);
		f1.ploshad();
	}
}

