package Lesson24;

public class Test17 {
	public static void main(String[] args) {
		Tiger1 tiger = new Tiger1();
		tiger.eat("myaso");
		try {
			tiger.drink("voda");
			try {
				tiger.drink("pivo");
			} catch (NeVodaException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("inner finally block");
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class NeMyasoException extends RuntimeException {

	public NeMyasoException() {

	}

	public NeMyasoException(String message) {
		super(message);
	}
}

class NeVodaException extends Exception {

	public NeVodaException() {

	}

	public NeVodaException(String message) {
		super(message);
	}
}

class Tiger1 {

	public void eat(String str) {
		if (!str.equals("myaso")) {
			throw new NeMyasoException("Tigr ne est " + str);
		} else {
			System.out.println("Tigr est myaso");
		}
	}

	public void drink(String str) throws NeVodaException {
		if (!str.equals("voda")) {
			throw new NeVodaException("Tigr ne pyet " + str);
		} else {
			System.out.println("Tigr pyet vodu");
		}
	}
}
