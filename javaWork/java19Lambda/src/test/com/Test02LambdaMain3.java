package test.com;

public class Test02LambdaMain3 {

	public static void main(String[] args) {
		System.out.println("lambda");
		// 2.람다식으로 표현해서 리터럴로 사용할 수 있다.
		// 람다식으로 사용하고자 하는 인터페이스의 추상메소드는 무조건 1개만 정의되어있어야한다.

		// 실행문이 여러줄일 때는 블럭처리
		// Bus 와 Taxi를 이용해서 람다식으로 처리할것.
		// 익명내부클래스와 람다식의 변환가능 : 커서를 위치하고 단축키 ctrl + 1

		// 1.변수할당 람다식
//		Bus b = (int x)->System.out.println("open()..."+x);
		Bus b = (x) -> System.out.println("open()..." + x);
		b.open(10);

		// 2.인자
		test((x) -> System.out.println("open()..." + x));

		// 3.리턴문
		test2().open(1000);

		// 1.변수할당 람다식
//		Taxi t = (int x,int y)->x + y;
		Taxi t = (x, y) -> x + y;
		int result = t.sum(11, 22);
		System.out.println(result);

		// 2.인자
		test3((x, y) -> x + y);

		// 3.리턴문
		result = test4().sum(1111, 2222);
		System.out.println(result);
	}// end main

	private static Taxi test4() {
		return (x, y) -> x + y;
	}

	private static void test3(Taxi t) {
		int result = t.sum(111, 222);
		System.out.println(result);
	}

	private static Bus test2() {
		return (x) -> System.out.println("open()..." + x);
	}

	private static void test(Bus b) {
		b.open(100);
	}

}// end class
