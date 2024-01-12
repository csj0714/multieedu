package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01Main6 {

	public static void main(String[] args) {
		System.out.println("Generic...제네릭");

		// 제네릭 클래스에 타입제한 - 상속관계 extends Number
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

		// Number와 상속관계가 아닌 타입들은 제한됨.
//		TestList4<String> list2 = new TestList4<String>();
//		list2.addType("kim");
//		System.out.println(list2);
//		System.out.println(list2.getType());
//		System.out.println(list2.getType().getClass().getName());
//		System.out.println("======");
//		
//		TestList4<TestVO> list3 = new TestList4<TestVO>();
//		list3.addType(new TestVO());
//		System.out.println(list3);
//		System.out.println(list3.getType());
//		System.out.println(list3.getType().getClass().getName());
//		System.out.println("======");
//		
//		
//		TestList4<Car> list4 = new TestList4<Car>();
//		list4.addType(new Car());
//		System.out.println(list4);
//		System.out.println(list4.getType());
//		System.out.println(list4.getType().getClass().getName());
//		System.out.println("======");

		// 상속관계의 제한적인 타입만 받아주는 메소드를 정의할 수있다<<<제네릭 메소드
		System.out.println(list1.getGet(10000));
		System.out.println(list1.getGet(33.33));
//		System.out.println(list1.getGet("kim"));
//		System.out.println(list1.getGet(new TestVO()));
//		System.out.println(list1.getGet(new Car()));
//		System.out.println(list1.getGet(new Bus()));
//		System.out.println(list1.getGet(new BigBus()));

		// 상속관계의 제한적인 타입만 스테틱 제네릭메소드도 사용가능
		System.out.println(TestList4.getStaticGet(10000));
		System.out.println(TestList4.getStaticGet(33.33));
//		System.out.println(TestList4.getStaticGet("kim"));
//		System.out.println(TestList4.getStaticGet(new TestVO()));
//		System.out.println(TestList4.getStaticGet(new Car()));
//		System.out.println(TestList4.getStaticGet(new Bus()));
//		System.out.println(TestList4.getStaticGet(new BigBus()));

	}// end main

}// end class