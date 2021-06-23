package Lesson3;

public class TestMethod {
	int sum(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}

	int avg(int a2, int b2, int c2) {
		int result2 = sum(a2, b2, c2) / 3;
		return result2;
	}
}

class testMethod2 {
	public static void main(String[] args) {
		TestMethod t = new TestMethod();
		int sumThreeNumbers = t.sum(1,2,7);
		System.out.println(sumThreeNumbers);
		System.out.println(t.sum(4,5,11));

		System.out.println(t.avg(20,40,60));
	}
}
