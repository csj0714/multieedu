package test.com;

public class Test02LambdaMain2 {

	public static void main(String[] args) {
		System.out.println("lambda");
		// 2.람다식으로 표현해서 리터럴로 사용할 수 있다.
		// 람다식으로 사용하고자 하는 인터페이스의 추상메소드는 무조건 1개만 정의되어있어야한다.

		// 실행문이 여러줄일 때는 블럭처리

		// 1.변수할당 람다식
//		Car c = ()->{
//				System.out.println("start()...");
//				return 11;
//			};
//		Car c = ()->{return 11;};
		Car c = () -> 11;
		System.out.println(c.start());

		// 2.인자
		test(() -> 111);

		// 3.리턴문
		System.out.println(test2().start());

	}// end main

	private static Car test2() {
		return () -> 1111;
	}

	private static void test(Car c) {
		System.out.println(c.start());
	}

}// end class
