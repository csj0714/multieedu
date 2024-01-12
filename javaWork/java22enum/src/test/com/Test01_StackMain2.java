package test.com;

import java.util.Stack;

public class Test01_StackMain2 {

	public static void main(String[] args) {
		System.out.println("LIFO~FIFO");

		// 동전 객체를 만들어서 사용해보자
		Stack<Coin> st = new Stack<Coin>();
		for (int i = 0; i < 5; i++) {
			st.push(new Coin(100 + i));
		}
		System.out.println(st);
		System.out.println("st.size():" + st.size());
		System.out.println(st.peek());// 뽑으려는 대상이 무엇인지 확인하는 함수
		System.out.println("==========");

		for (Coin x : st) {
			System.out.println(x);
		}
		System.out.println("==========");

		// 마지막에 들어있는 대상 추출(뽑기)- 길이가 줄어든다.
		System.out.println(st.pop());// Coin [value=104]
		System.out.println("st.size():" + st.size());
		System.out.println(st.pop());// Coin [value=103]
		System.out.println("st.size():" + st.size());
		System.out.println(st.pop());// Coin [value=102]
		System.out.println("st.size():" + st.size());
		System.out.println(st.pop());// Coin [value=101]
		System.out.println("st.size():" + st.size());

		// 비었는 상태에서는 익셉션 발생
//		System.out.println(st.peek());//뽑으려는 대상이 무엇인지 확인하는 함수

	}// end main

}// end class