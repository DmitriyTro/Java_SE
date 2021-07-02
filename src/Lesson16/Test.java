package Lesson16;

public class Test {
	public static void main(String[] args) {
		int[] array;
		String[] array2;
		double[][] array3;
		int[][] array4;

		array = new int[8];
		array2 = new String[3];
		array3 = new double[4][2];
		array4 = new int[3][];

		array2[0] = "Hello";
		array2[1] = "Bye";
		array2[2] = "Ok";

		array3[0][0] = 3.14;
		array3[2][1] = 3.14;

		System.out.println(array3[2][1]);
		System.out.println(array2.length);

		double[] array5;
		array5 = new double[2];
		array5[0] = 2.5;
		array5[1] = 3.5;

		array3[1] = array5;
		System.out.println(array3[1][0]);
	}
}
