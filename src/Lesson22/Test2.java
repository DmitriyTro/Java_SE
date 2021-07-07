package Lesson22;

public class Test2 {
	public static void main(String[] args) {
		String[] array = {"privet", "poka"};
		Object[] array2 = array;
		String[] array3 = (String[])array2;
//		array3[0] = new StringBuilder("ok");
//		array2[0] = new StringBuilder("ok");
	}
}
