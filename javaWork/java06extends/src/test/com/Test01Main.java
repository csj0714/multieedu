package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("extends...상속");

		// 1.클래스간의 상속 = 단일상속만 가능,extends
		GrandFather gf = new GrandFather();
		System.out.println(gf.name);
		System.out.println(gf.age);
		gf.sleep();

		System.out.println("=============");

		Father f = new Father();
		System.out.println(f.name);
		System.out.println(f.age);
		System.out.println(f.car_name);
		f.sleep();
		f.work();

		System.out.println("=============");
		My m = new My();
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.car_name);
		System.out.println(m.school_name);
		m.sleep();
		m.work();
		m.study();

		// 2.인터페이스간의 상속 = 다중상속 가능,extends

		// 3.클래스와 인터페이스간의 상속 = 다중상속가능,
		// 클래스만 인터페이스를 상속받기가능.implements

		GrandFather gf2 = new Father(); // father 에서 재정의된 함수만 바꾸어지고 나머지는 못씀
		gf2.sleep();
		System.out.println("d");
		Father f2 = new My();
		System.out.println(f instanceof GrandFather);

		GrandFather gf3 = test();

		My m2 = new My() {
			String tel = "010";

			void eat() {
				System.out.println("eat");
			}
		};

		m2.sleep();
//		m2.eat() X -> 상속받은 것들만 사용가능

	}// end main

	private static GrandFather test() {
		System.out.println("test()....");
		return new My();
	}

}// end class
