package test.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test03LambdaMain4 {

	public static void main(String[] args) {
		System.out.println("Lambda 4");

		TestVO vo1 = new TestVO("kim", 11);
		TestVO vo2 = new TestVO("lee", 33);
		TestVO vo3 = new TestVO("han", 22);

		// 객체의 속성중 이름에대해서 오름차순으로 정렬이되도록 하세요(람다식 사용할것)

		List<TestVO> list1 = Arrays.asList(vo1, vo2, vo3);
		System.out.println(list1);

		list1.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println(list1);

		// 객체의 속성중 나이에대해서 내림차순으로 정렬이되도록 하세요(람다식 사용할것)

		list1.sort((o1, o2) -> o1.getAge() - o2.getAge());
		System.out.println(list1);

	}// end main

}// end class