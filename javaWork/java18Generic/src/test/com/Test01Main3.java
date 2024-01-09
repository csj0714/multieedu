package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01Main3 {

	public static void main(String[] args) {
		System.out.println("Generic...제네릭");

		// ArrayList 클래스를 모방해서 제네릭클래스를 만들어보자
		// 즉, 아무타입으로든 특정지을수있는 클래스를 만들어보자.
		TestList<Integer> list1 = new TestList<Integer>();
		list1.addType(10000);
		System.out.println(list1);
		System.out.println(list1.getType());
		System.out.println(list1.getType().getClass().getName());
		System.out.println("======");

		TestList<String> list2 = new TestList<String>();
		list2.addType("kim");
		System.out.println(list2);
		System.out.println(list2.getType());
		System.out.println(list2.getType().getClass().getName());
		System.out.println("======");

		TestList<TestVO> list3 = new TestList<TestVO>();
		list3.addType(new TestVO());
		System.out.println(list3);
		System.out.println(list3.getType());
		System.out.println(list3.getType().getClass().getName());
		System.out.println("======");

		TestList<Car> list4 = new TestList<Car>();
		list4.addType(new Car());
		System.out.println(list4);
		System.out.println(list4.getType());
		System.out.println(list4.getType().getClass().getName());
		System.out.println("======");

		TestList<Bus> list5 = new TestList<Bus>();
		list5.addType(new Bus());
		System.out.println(list5);
		System.out.println(list5.getType());
		System.out.println(list5.getType().getClass().getName());
		System.out.println("======");

		TestList<BigBus> list6 = new TestList<BigBus>();
		list6.addType(new BigBus());
		System.out.println(list6);
		System.out.println(list6.getType());
		System.out.println(list6.getType().getClass().getName());
		System.out.println("======");

	}// end main

}// end class
