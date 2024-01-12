package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01Main7 {

	public static void main(String[] args) {
		System.out.println("Generic...제네릭");

		// 제네릭 클래스에 타입제한 - TestList6<T extends Bus>
		TestList6<Bus> list5 = new TestList6<Bus>();
		list5.addType(new Bus());
		System.out.println(list5);
		System.out.println(list5.getType());
		System.out.println(list5.getType().getClass().getName());
		System.out.println("======");

		TestList6<BigBus> list6 = new TestList6<BigBus>();
		list6.addType(new BigBus());
		System.out.println(list6);
		System.out.println(list6.getType());
		System.out.println(list6.getType().getClass().getName());
		System.out.println("======");

		// <G extends Bus>
//		System.out.println(list5.getGet(10000));
//		System.out.println(list5.getGet(33.33));
//		System.out.println(list5.getGet("kim"));
//		System.out.println(list5.getGet(new TestVO()));
//		System.out.println(list5.getGet(new Car()));
		System.out.println(list5.getGet(new Bus()));
		System.out.println(list5.getGet(new BigBus()));

		// static <G extends Bus>
//		System.out.println(TestList6.getStaticGet(10000));
//		System.out.println(TestList6.getStaticGet(33.33));
//		System.out.println(TestList6.getStaticGet("kim"));
//		System.out.println(TestList6.getStaticGet(new TestVO()));
//		System.out.println(TestList6.getStaticGet(new Car()));
		System.out.println(TestList6.getStaticGet(new Bus()));
		System.out.println(TestList6.getStaticGet(new BigBus()));

	}// end main

}// end class