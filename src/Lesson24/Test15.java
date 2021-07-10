package Lesson24;

public class Test15 {

	void marafon(int temperaturaVozduha, int tempBega) throws PovernulNoguException {
		if (tempBega > 12) {
			throw new PovernulNoguException("Temp bega bil slishkom visokim: " + tempBega);
		}

		if (temperaturaVozduha > 32) {
			throw new SveloMishcuException();
		}
		System.out.println("Vi probejali marafon");
	}

	public static void main(String[] args) {
		Test15 test = new Test15();
		try {
			test.marafon(40, 10);
		} catch (PovernulNoguException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("V lybom sluchae vi poluchite gramotu!");
		}
	}
}

class PovernulNoguException extends Exception {

	PovernulNoguException() {

	}

	PovernulNoguException(String message) {
		super(message);
	}
}

class SveloMishcuException extends RuntimeException {

	SveloMishcuException() {

	}

	SveloMishcuException(String message) {
		super(message);
	}
}
