package test.com;

import java.util.Arrays;
import java.util.List;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Stream...스트림..");

		// 자바 스트림이란? : 컬렉션과 배열등의 요소들을 참조하며
		// 람다식을 적용할 수 있다.
		// 반복수행하는 기능구현에 뛰어나다.

		// List 내에 있는 문자열중에서 a라는 문자가 들어있는 요소에대해 카운팅하고싶다.
		List<String> names = Arrays.asList("aaa", "bbb", "ccac");
		int count = 0;
		for (String x : names) {
			if (x.contains("a")) {
				System.out.println(x);
				count++;
			}
		}
		System.out.println(count);
		System.out.println("==============");

		// 스트림을 사용 : List 내에 있는 문자열중에서 a라는 문자가 들어있는 요소에대해 카운팅하고싶다.
		// 스트림 파이프라인 ==> 함수형프로그래밍
		long cnt = names.stream().filter((x) -> x.contains("a")).count();
		System.out.println(cnt);

		System.out.println("==============");
		// a로 시작하는 요소만 카운트하기.
		cnt = names.stream().filter((x) -> x.startsWith("a")).count();
		System.out.println(cnt);

		System.out.println("==============");
		// a로 시작하는 요소만 카운트하기.
		// parallelStream(): 스레드처리가능,스레드처리 횟수가 많지않고,요소의개수가 엄청많을때 사용권장.
		cnt = names.parallelStream().filter((x) -> x.startsWith("a")).count();
		System.out.println(cnt);

	}// end main

}// end class
