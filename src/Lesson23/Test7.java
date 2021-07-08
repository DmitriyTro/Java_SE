package Lesson23;

public class Test7 {
	static final int B;
	int a = 10;

	static {
		B = 20;
	}
}

class A {
	static int c;
	static final int D;
	static final int E = 1;
	static final int F;

	static {
//		c = 5;
		D = 3;
//		E = 2;
		F = 0;
	}
}

class B {

	static {
		abc(2);  // 1
	}

	static void abc(int a) {
		System.out.println(a + " ");
	}

	public B() {
		abc(5); // 6
	}

	static {
		abc(4); // 2
	}

	{
		abc(6); // 4 after 3
	}

	static {
		new B(); // 3
	}

	{
		abc(8); // 5
	}

	public static void main(String[] args) {

	}
}
