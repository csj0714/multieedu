package test.com;

import java.util.LinkedList;
import java.util.Queue;

public class Test02_QueueMain {

	public static void main(String[] args) {
		System.out.println("LIFO~FIFO");

		// 먼저들어간 데이터가 먼저나오는 구조.
		Queue<String> q = new LinkedList<String>();

		q.offer("hello1");
		q.offer("hello2");
		q.offer("hello3");
		q.offer("hello4");
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println("===============");
		System.out.println(q.isEmpty());// 큐가 비었니?
		System.out.println("===============");

		// for 내용확인
		for (String x : q) {
			System.out.println(x);
		}
		System.out.println("===============");

		while (!q.isEmpty()) {// 큐가 안비었니?
			System.out.println(q.poll());// 뽑기
			System.out.println(q.size());
		}

	}// end main

}// end class