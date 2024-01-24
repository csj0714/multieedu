package test.com;

public class Test02LambdaMain5 {

	public static void main(String[] args) {
		System.out.println("lambda");
		// 2.람다식으로 표현해서 리터럴로 사용할 수 있다.
		// 람다식으로 사용하고자 하는 인터페이스의 추상메소드는 무조건 1개만 정의되어있어야한다.

		// 실행문이 여러줄일 때는 블럭처리

		// 1.변수할당 람다식
		MyValidator2 mv = (x, y) -> {
			System.out.println("check()....");
			return true;
		};

		boolean result = mv.check(3, 4);
		System.out.println(result);

		// 2.인자
		test((x, y) -> false);

		// 3.리턴문
		System.out.println(test2().check(3, 4));

	}// end main

	private static MyValidator2 test2() {
		System.out.println("test2.check()....");
		return (x, y) -> false;
	}

	private static void test(MyValidator2 mv) {
		System.out.println("test(() -> return)....");
	}

}// end class
