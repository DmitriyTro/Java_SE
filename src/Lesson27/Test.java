package Lesson27;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
//		ArrayList<String> aL = new ArrayList<>();
		Info<String> info = new Info<>("Hello");
		System.out.println(info);
		String s = info.getValue();

		Info<Integer> info2 = new Info<>(100);
		System.out.println(info2);
		Integer i = info2.getValue();
	}

//	public void abc(Info<String> info) {
//		String s = info.getValue();
//	}
//
//	public void abc(Info<Integer> info) {
//		Integer i = info.getValue();
//	}

//	void abc(Info info) {
//	}
}

class Info<T> {
	private T value;

	public Info(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "{ " + value + " }";
	}
}

class Parent {

	public void abc(Info<String> info) {
		String s = info.getValue();
	}
}

class Child extends Parent {  //problem

//	public void abc(Info<Integer> info) {
//		Integer i = info.getValue();
//	}
}