package test.com;

import java.util.Stack;

public class Test01_StackMain {

	public static void main(String[] args) {
		System.out.println("LIFO~FIFO");

		Stack<Integer> st = new Stack<Integer>();
		st.push(5001);
		st.push(5002);
		st.push(5003);
		st.push(5004);
		System.out.println(st);
		System.out.println("st.size():" + st.size());
		System.out.println(st.peek());// 뽑으려는 대상이 무엇인지 확인하는 함수
		System.out.println("==========");

		for (Integer x : st) {
			System.out.println(x);
		}
		System.out.println("==========");

		// 마지막에 들어있는 대상 추출(뽑기)- 길이가 줄어든다.
		System.out.println(st.pop());// 5004
		System.out.println("st.size():" + st.size());
		System.out.println(st.pop());// 5003
		System.out.println("st.size():" + st.size());
		System.out.println(st.pop());// 5002
		System.out.println("st.size():" + st.size());
		System.out.println(st.pop());// 5001
		System.out.println("st.size():" + st.size());

		// 비었는 상태에서는 익셉션 발생
//		System.out.println(st.peek());//뽑으려는 대상이 무엇인지 확인하는 함수

	}// end main

}// end class