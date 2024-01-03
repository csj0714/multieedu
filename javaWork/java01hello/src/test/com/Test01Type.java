package test.com;

public class Test01Type {

	public static void main(String[] args) {
		System.out.println("type");

		// 1.기본타입(원시타입) 8개 - 숫자관련타입들
		// byte,short,char,int,long,float,double

		// byte - 1byte
		System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		byte bt = 127;
		System.out.println(bt);
		System.out.println(++bt);
		System.out.println(++bt);

		// short - 2byte
		System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		short st = 32767;
		System.out.println(st);
		System.out.println(++st);
		System.out.println(++st);

		// char - 2byte : 양수만,하나의 문자(문자형)
		System.out.println(Character.MIN_VALUE + "~" + Character.MAX_VALUE);
		System.out.println((int) Character.MIN_VALUE + "~" + (int) Character.MAX_VALUE);
		char ch = 65535;
		System.out.println((int) ch);
		ch = 65;
		System.out.println(ch);
		System.out.println((int) ch);
		ch = 'a';
		System.out.println(ch);
		System.out.println((int) ch);

		// 2.참조타입 - 문자열,객체,배열 관련타입들..

	}// end main

}// end class