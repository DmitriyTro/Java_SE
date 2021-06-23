package Lesson1;

public class PrimitiveDataTypes {
	public static void main(String[] args) {

		byte b1 = 7; // 8 bit
		byte b2 = 0x7; // 8 bit
		byte b3 = 07; // 8 bit
		byte b4 = 0b111; // 8 bit

		short s1 = -10; // 16 bit

		int i1 = 500; // 32 bit default type
		int i2 = 0x1F4; // 32 bit default type
		int i3 = 0764; // 32 bit default type
		int i4 = 0b111_110_100; // 32 bit default type

		long l1 = 1_000_000_000L; // 64 bit

		float f1 = 3.14f; // 32 bit

		double d1 = 5.5; // 64 bit default type

		char ch1 = 'C'; // 16 bit
		char ch2 = 500;
		char ch3 = '\u0500';

		boolean bl1 = true;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
	}
}
