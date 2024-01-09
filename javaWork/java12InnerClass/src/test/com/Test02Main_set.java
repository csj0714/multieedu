package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Test02Main_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Collection 자료구조");

		HashSet<Integer> set = new HashSet<Integer>();

		Random random = new Random();

		for (int i = 0; set.size() < 6; i++) {
			set.add(random.nextInt(45) + 1);
		}

		System.out.println(set);
		List<Integer> list = new ArrayList<>(set);

		Collections.sort(list);
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		Object[] arr = set.toArray();
		Arrays.sort(arr);

		System.out.println("랜덤하게 뽑힌 숫자는" + Arrays.asList(arr));
		System.out.println("랜덤하게 뽑힌 숫자는" + list);
	}// end main

}// end class
