package test.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test03LambdaMain7 {

	public static void main(String[] args) {
		System.out.println("Lambda 4");

		TestVO vo1 = new TestVO("kim", 11);
		TestVO vo2 = new TestVO("lee", 33);
		TestVO vo3 = new TestVO("han", 22);

		List<TestVO> list1 = Arrays.asList(vo1, vo2, vo3);
		System.out.println(list1);

		// comparing메소드와 ::연산자를 이용한 메소드레퍼런스
		list1.sort(Comparator.comparing(TestVO::getName));
		System.out.println(list1);

		// comparing메소드와 ::연산자를 이용한 메소드레퍼런스
		list1.sort(Comparator.comparing(TestVO::getAge));
		System.out.println(list1);

	}// end main

}// end class