package Lesson21;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a1 = new Penguin("Kovalski_1");
		Animal a2 = new Mechenosec("Karl_1");
		Animal a3 = new Lev("Timo_1");

		Bird b1 = new Penguin("Kovalski_2");
		Fish f1 = new Mechenosec("Karl_2");
		Mammal m1 = new Lev("Timo_2");

		Lev l1 = new Lev("Timo_3");
		Penguin p1 = new Penguin("Kovalski_3");
		Mechenosec mech1 = new Mechenosec("Karl_3");

		Speakable s1 = new Penguin("Kovalski_4");
		Speakable s2 = new Lev("Timo_4");

		Animal[] animals = {a1, a2, a3, b1, f1, m1, l1, p1, p1, mech1};
		for (Animal a : animals) {
			if (a instanceof Penguin) {
				Penguin p = (Penguin) a;
				System.out.println(p.name);
				p.eat();
				p.sleep();
				p.speak();
				p.fly();
			} else if (a instanceof Mechenosec) {
				Mechenosec mech = (Mechenosec) a;
				System.out.println(mech.name);
				mech.eat();
				mech.sleep();
				mech.swim();
			} else if (a instanceof Lev) {
				Lev l = (Lev) a;
				System.out.println(l.name);
				l.eat();
				l.sleep();
				l.speak();
				l.run();
			}
			System.out.println("--------------------");
		}

		Speakable[] speakables = {b1, m1, l1, p1, s1, s2};
		for (Speakable s : speakables) {
			if (s instanceof Penguin) {
				Penguin p = (Penguin) s;
				System.out.println(p.name);
				p.eat();
				p.sleep();
				p.speak();
				p.fly();
			} else if (s instanceof Lev) {
				Lev l = (Lev) s;
				System.out.println(l.name);
				l.eat();
				l.sleep();
				l.speak();
				l.run();
			}
			System.out.println("--------------------");
		}
	}
}
