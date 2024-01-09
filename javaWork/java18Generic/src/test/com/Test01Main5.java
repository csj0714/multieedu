package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01Main5 {

	public static void main(String[] args) {
		System.out.println("Generic...제네릭");

		TestList3<Integer> list1 = new TestList3<Integer>();
		list1.addType(10000); // 특정지어진<Integer>타입만 받는 메소드

		// 아무타입이든지 다받아주는 메소드를 정의할 수있다<<<제네릭 메소드
		System.out.println(list1.getGet(10000));
		System.out.println(list1.getGet("kim"));
		System.out.println(list1.getGet(new TestVO()));
		System.out.println(list1.getGet(new Car()));
		System.out.println(list1.getGet(new Bus()));
		System.out.println(list1.getGet(new BigBus()));

		System.out.println(list1.getStaticGet(10000));
		System.out.println(list1.getStaticGet("kim"));
		System.out.println(list1.getStaticGet(new TestVO()));
		System.out.println(list1.getStaticGet(new Car()));
		System.out.println(list1.getStaticGet(new Bus()));
		System.out.println(list1.getStaticGet(new BigBus()));
	}// end main

}// end class