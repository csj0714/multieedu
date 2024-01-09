package test.com;

import test.com.MemberOuter.Bus;
import test.com.MemberOuter.Student;

public class Test01InnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inner class");

		class Person {
			String name = "kim";
			int age = 33;

			public Person() {
				System.out.println("Person");
			}

			public void sleep() {
				System.out.println("sleep");
			}
		}
		Person p = new Person();
		System.out.println(p);

		class Car {

		}
		Car c = new Car();
		System.out.println(c);

		Bus bus = new Bus();
		System.out.println(bus);
		Bus.start();
	}// end main

}// end class
