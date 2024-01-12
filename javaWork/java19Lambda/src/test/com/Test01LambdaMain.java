package test.com;

public class Test01LambdaMain {

	public static void main(String[] args) {
		System.out.println("Lambda...");

		// 람다식을 이해하기위해서는 익명내부클래스를 이해해야한다.

		// java에서는 정의된 메소드를 리터럴로 사용 할 수 없어서 두가지 방법을 취한다.
		// 리터럴로 사용 : 변수할당,메소드 호출시 인자,리턴문 <<< 1급함수의 특징

		// 1.익명내부클래스로 함수를 감싸서 리터럴로 사용할 수 있다.
		Person p = new Person() {
			@Override
			public void sleep() {
				System.out.println("sleep()....1");
			}
		};
		p.sleep();

		test().sleep();

		test2(new Person() {
			@Override
			public void sleep() {
				System.out.println("sleep()....3");
			}
		});

		// 2.람다식으로 표현해서 리터럴로 사용할 수 있다.
	}// end main

	static void test2(Person p) {
		p.sleep();
	}

	static Person test() {
		return new Person() {
			@Override
			public void sleep() {
				System.out.println("sleep()....2");
			}
		};
	}

}// end class
