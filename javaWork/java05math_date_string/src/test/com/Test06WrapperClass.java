
package test.com;

public class Test06WrapperClass {

	// static 전역필드(전역변수,메소드,클래스)에만 명시가능
	public static final String NAME = "java";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("wrapper class");

		System.out.println(Integer.MIN_VALUE);
		// Integer.MIN_VALUE = 333;//final 상수
		System.out.println(Integer.MAX_VALUE);
		System.out.println("===========");

		// 10진수 >> 2진수의 문자열로 반환
		System.out.println(Integer.toBinaryString(0));
		System.out.println(Integer.toBinaryString(8));
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toBinaryString(127));
		System.out.println("===========");

		// 10진수 >> 8진수의 문자열로 반환
		System.out.println(Integer.toOctalString(0));
		System.out.println(Integer.toOctalString(8));
		System.out.println(Integer.toOctalString(17));

		// 10진수 >> 16진수의 문자열로 반환
		System.out.println("===========");
		System.out.println(Integer.toHexString(0));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toHexString(15));
		System.out.println(Integer.toHexString(256));

		// 숫자모양의 문자열 >> 정수로 반환
		System.out.println("===========");
		System.out.println(Integer.parseInt("999") + 1);
		// 주의 : 숫자형문자열이 아닌 데이터가 입력되면 오류발생
		// NumberFormatException

		System.out.println("===========");
		Integer a = 100;
		Integer b = 100;
		System.out.println(a == b);

		// 주의*****
		// 1byte범위(-128~127) 내에서만 ==,!=로 비교해야한다.
		// 넘어서는 숫자들의 비교는 equals 메소드를 사용할것
		Integer a2 = 1000;
		Integer b2 = 1000;
		System.out.println(a2 == b2);// false
		System.out.println(a2.equals(b2));// true

	}// end main

}// end class