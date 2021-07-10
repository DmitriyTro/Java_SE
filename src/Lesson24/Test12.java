package Lesson24;

public class Test12 {

	void abc() {
		int[] array = {1, 2, 3};
		try {
			System.out.println(array[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			String s = null;
			try {
				System.out.println(s.length());
			} catch (NullPointerException e2) {
				System.out.println("Inner catch block");
			}
		} catch (NullPointerException e) {
			System.out.println("NullPointerException was found");
		}
	}

	public static void main(String[] args) {
		Test12 test = new Test12();
		test.abc();
	}
}
