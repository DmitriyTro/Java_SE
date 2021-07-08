package Lesson23;

public class Test3 {

	void abc(int i) {
		System.out.println("int");
	}

	void abc(byte b) {
		System.out.println("byte");
	}

	void abc(long l) {
		System.out.println("long");
	}

	void abc(double d) {
		System.out.println("double");
	}

	void def(Object o) {
		System.out.println("object");
	}

	void def(String s) {
		System.out.println("string");
	}

	void ghi(int a, int b) {
		System.out.println("hello_1");
	}

	void ghi(long a, long b) {
		System.out.println("hello_2");
	}

	void ghi(Integer a, Integer b) {
		System.out.println("hello_3");
	}

	void ghi(int... a) {
		System.out.println("hello_4");
	}

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.abc(10);
		t.def(new StringBuilder("hello"));
		t.ghi(1,2);
	}
}
