package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test01Main_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Collection 자료구조");

		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");

		System.out.println(list);

		String[] strs = new String[5];
		for (int i = 0; i < strs.length; i++) {
			strs[i] = "kim" + i;
		}

//		List<String> list2 = new ArrayList<String>();
//		for (int i = 0; i < strs.length; i++) {
//			list2.add(strs[i]);
//		}
//		System.out.println(list2);

		List<String> list2 = Arrays.asList(strs);
		System.out.println(list2);

		strs = Arrays.copyOf(strs, 3); // 0번부터 몇개 복사
		list2 = Arrays.asList(strs);
		System.out.println(list2);
		strs = Arrays.copyOfRange(strs, 0, 2); // 1번부터 몇개 복사
		list2 = Arrays.asList(strs);
		System.out.println(list2);

		String[] strs2 = new String[7];
		Arrays.fill(strs2, "lee");
		list2 = Arrays.asList(strs2);
		System.out.println(list2);

		Integer[] sus = new Integer[] { 33, 22, 11, 55, 44 };

		Arrays.sort(sus, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});

		List<Integer> list3 = Arrays.asList(sus);
		System.out.println(list3);

		String[] names = new String[] { "Lee", "Gang", "Han" };

		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});

		List<String> list4 = Arrays.asList(names);
		System.out.println(list4);
	}
}
