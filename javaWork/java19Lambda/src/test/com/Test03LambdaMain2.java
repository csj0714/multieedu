package test.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test03LambdaMain2 {

	public static void main(String[] args) {
		System.out.println("Lambda 3");

		List<Integer> list1 = Arrays.asList(11, 33, 22);
		System.out.println(list1);
		System.out.println("==========");

//		list1.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
////				return o1-o2;
//				return o2-o1;
//			}
//		});
		list1.sort((o1, o2) -> o1 - o2);
		System.out.println(list1);
		System.out.println("==========");

		Integer[] sus = new Integer[] { 55, 33, 44 };
		Arrays.sort(sus, (o1, o2) -> o1 - o2);
		System.out.println(Arrays.asList(sus));
		System.out.println("==========");

	}// end main

}// end class