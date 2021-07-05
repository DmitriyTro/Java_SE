package Lesson19;

public class Human {
	final String gender;
	private String name;
	private int age;
	private int weight;

	Human(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (age > 0) {
			this.weight = weight;
		}
	}
}

class Test2 {
	public static void main(String[] args) {
		Human human = new Human("male");
		human.setName("Petya");
		human.setAge(15);
		human.setWeight(50);
		System.out.println(human.getName());
		System.out.println(human.getAge());
		System.out.println(human.getWeight());
	}
}
