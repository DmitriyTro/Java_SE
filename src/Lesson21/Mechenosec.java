package Lesson21;

public class Mechenosec extends Fish {

	public Mechenosec() {
	}

	public Mechenosec(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void swim() {
		System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
	}

	@Override
	public void eat() {
		System.out.println("Mechenosec ne xishnaya, i ona est obichniy ribiy korm!");
	}
}
