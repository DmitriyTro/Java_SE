package Lesson23;

public class Test5 {
	String s1;

	{
		System.out.println("init block_3");
	}

	Test5() {
		System.out.println("constructor_1");
	}

	Test5(int a) {
		this();
		System.out.println("constructor_2");
	}

	{
		System.out.println("init block_1");
	}

	static {
		System.out.println("static init block_1");
	}

	{
		System.out.println("init block_2");
	}

	static {
		System.out.println("static init block_2");
	}

	public static void main(String[] args) {
		Test5 t = new Test5();
		Test5 t2 = new Test5(5);
	}
}
