package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Enum....열거형 객체");

		// 특정된 대명사들을 상수로 열거해서 객체화할 수 있다.
		// 계절명칭,요일명칭,월명칭,,,,등을 대부분사용하고
		// 필요에 의해서 일반대명사들도 사용할 수있다(예:차모델명,배우이름,행사명,,,)

		// Enum상수와 Interface상수와의 차이를 알아보자.

		// 1.접근과 출력결과는 동일하다.
		System.out.println(Test01_week.FRIDAY);
		System.out.println(Test01_week2.FRIDAY);
		System.out.println("===============");

		// 2.반환타입이 다르다
		Test01_week today = Test01_week.FRIDAY;
		System.out.println(today);
		String today2 = Test01_week2.FRIDAY;
		System.out.println(today2);
		System.out.println("===============");

		// 3.name메소드로 문자열타입반환
		System.out.println(today.name());// String

		// 4.ordinal메소드로 열거된상수의 순서위치(인덱스)반환
		System.out.println(today.ordinal());// int

	}// end main

}// end class