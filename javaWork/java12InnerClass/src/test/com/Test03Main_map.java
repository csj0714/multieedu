package test.com;

import java.util.HashMap;

public class Test03Main_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Collection 자료구조");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("kor", 77);
		map.put("kor", 88);
		map.put("eng", 99);

		System.out.println(map.size());
		System.out.println(map.get("kor"));
		System.out.println(map.get("eng"));
		System.out.println(map.keySet());
		System.out.println(map.values());

		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}
}
