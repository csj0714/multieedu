package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Collection 자료구조");

		ArrayList list = new ArrayList();
		list.add(1000);
		list.add(1000);
		list.add("kim");
		System.out.println(list);

		// Array 생략 가능
		// ArrayList<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2000);
		list2.add(2000);
		list2.add(2000);

		list2.set(1, 333);
		list2.remove(2);

		System.out.println(list2);
		System.out.println(list2.size());
		System.out.println(list2.get(0));

		list2.clear();
		System.out.println(list2);
		// asList는 사이즈가 고정됌
		// List<Integer> list3 = Arrays.asList(11, 22, 33);
		Integer[] sus = new Integer[] { 1, 2, 3 };
		List<Integer> list3 = Arrays.asList(sus);
		for (int i = 0; i < sus.length; i++) {
			System.out.println(list3.get(i));
		}
		// 데이터 추가, 삭제 안됌
		list3.set(0, 55);
		System.out.println(list3);

	}
}
