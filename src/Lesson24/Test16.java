package Lesson24;

public class Test16 {
	public static void main(String[] args) {
		try {
			Human human = new Human("Ivan", 20);
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}

class Human {
	String name;
	int age;

	public Human(String name, int age) throws Exception {
		this.name = name;
		this.age = age;
		if (age < 0) {
			throw new Exception("Nekorrektniy vozrast");
		}
	}

	void abc() throws Exception {
		System.out.println("Ok");
	}
}