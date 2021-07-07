package Lesson22;

public class Test5 {
//	int a, b = 3, c, d = b + 5;

}

class Test8 implements i10, i11 {

	public void abc() {
		System.out.println("Ok");
	}

	public static void main(String[] args) {
		Test8 t = new Test8();
		System.out.println(((i10)t).a);
		t.abc();
	}
}

interface i10 {
	int a = 5;

	void abc();
}

interface i11 {
	int a = 10;

	void abc();
}