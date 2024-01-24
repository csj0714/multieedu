package test.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test03LambdaMain5 {

	static class ListTestVONameASC implements Comparator<TestVO> {
		@Override
		public int compare(TestVO o1, TestVO o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	static class ListTestVOAgeDESC implements Comparator<TestVO> {
		@Override
		public int compare(TestVO o1, TestVO o2) {
			return o2.getAge() - o1.getAge();
		}
	}

	public static void main(String[] args) {
		System.out.println("Lambda 4");

		TestVO vo1 = new TestVO("kim", 11);
		TestVO vo2 = new TestVO("lee", 33);
		TestVO vo3 = new TestVO("han", 22);

		List<TestVO> list1 = Arrays.asList(vo1, vo2, vo3);
		System.out.println(list1);

		// Comparator<TestVO>를 상속받는 클래스를 이용한 정렬
		// ListTestVONameASC : 이름으로 순정렬하는 사용자정의 클래스
		list1.sort(new ListTestVONameASC());
		System.out.println(list1);

		// ListTestVOAgeDESC : 나이로 역정렬하는 사용자정의 클래스
		list1.sort(new ListTestVOAgeDESC());
		System.out.println(list1);

	}// end main

}// end class