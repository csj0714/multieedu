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

		System.out.println("-------------");
		// 다형성
		// 상속관계에서는 부모(슈퍼)클래스의 초기화를 자식(서브)클래스의 생성자로 객체생성가능.
		// 단,사용가능 자원은 부모클래스 자원으로 한정된다.
		// 프로그램 유지보수(수정,변경)에 유용하다.
		// 단점,속도가 느려진다.
		GrandFather gf2 = new Father();
		Father f2 = new My();
		System.out.println(f instanceof GrandFather);
		System.out.println(f instanceof Father);
		System.out.println(m instanceof My);
		System.out.println(m instanceof Father);
		System.out.println(m instanceof GrandFather);
		System.out.println(f2 instanceof Father);

		System.out.println("-------------");

		GrandFather gf3 = test();

		System.out.println("-------------");
		// extends 예약어없이 상속관계성립하는 예: 익명내부클래스를 이용한 상속처리
		My m2 = new My() {
			// 클래스영역
			// My클래스를 상속받은 클래스가된다.
			String tel = "010";
			String school_name = "MultiCam20";

			void eat() {
				System.out.println("eat()....");
				study();
			}

			// 재정의된 메소드가 최종 호출된다.
			@Override
			void study() {
				System.out.println("Anonymous study()...");
			}
		};
		System.out.println(m2.school_name);
//		System.out.println(m2.tel);//컴파일오류(다형성으로 객체생성)
		m2.study();

		// 2.인터페이스간의 상속 = 다중상속 가능,extends

		// 3.클래스와 인터페이스간의 상속 = 다중상속가능,
		// 클래스만 인터페이스를 상속받기가능.implements

	}// end main

	private static GrandFather test() {
		System.out.println("test()....");
//		GrandFather obj = new GrandFather();
//		Father obj = new Father();
//		My obj = new My();
		My obj = new My() {
		};

		return obj;
//		return new GrandFather();
//		return new Father();
//		return new My();
	}

}// end class
