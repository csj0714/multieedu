package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01Main6 {

	public static void main(String[] args) {
		System.out.println("Generic...제네릭");

		TestList4<Integer> list1 = new TestList4<Integer>();
		list1.addType(10000);
		System.out.println(list1);
		System.out.println(list1.getType());
		System.out.println(list1.getType().getClass().getName());
		System.out.println("======");

		TestList4<Double> list11 = new TestList4<Double>();
		list11.addType(33.33);
		System.out.println(list11);
		System.out.println(list11.getType());
		System.out.println(list11.getType().getClass().getName());
		System.out.println("======");

		TestList4<String> list2 = new TestList4<String>();
		list2.addType("kim");
		System.out.println(list2);
		System.out.println(list2.getType());
		System.out.println(list2.getType().getClass().getName());
		System.out.println("======");

		TestList4<TestVO> list3 = new TestList4<TestVO>();
		list3.addType(new TestVO());
		System.out.println(list3);
		System.out.println(list3.getType());
		System.out.println(list3.getType().getClass().getName());
		System.out.println("======");

		TestList4<Car> list4 = new TestList4<Car>();
		list4.addType(new Car());
		System.out.println(list4);
		System.out.println(list4.getType());
		System.out.println(list4.getType().getClass().getName());
		System.out.println("======");

	}// end main

}// end class