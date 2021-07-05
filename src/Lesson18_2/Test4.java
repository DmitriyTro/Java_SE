package Lesson18_2;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(777, "Ivanov Mikhail");
		map.put(778, "Sidorova Mariya");
		map.put(779, "Petrova Anna");
		map.put(777, "Novikova Marina");
		map.remove(777);
		System.out.println("Map = " + map);
	}
}
