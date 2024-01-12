package test.com;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test01Main5 {

	public static void main(String[] args) {
		System.out.println("Stream...스트림..");

		// 정수 범위지정 함수 사용
		System.out.println(IntStream.range(0, 10).boxed().toList());
		System.out.println(IntStream.range(0, 10).boxed().collect(Collectors.toList()));

		IntStream.range(0, 10).boxed().forEach(System.out::print);
		System.out.println();

		IntStream.range(0, 10).boxed().forEach(System.out::println);
		System.out.println("===============");

		// 각요소를 10배증가 시켜서 출력
		IntStream.range(0, 10).boxed().map(x -> x * 10).forEach(System.out::println);
		System.out.println("===============");

		// 각요소에 문자열("hello")을 추가해서 출력
		IntStream.range(0, 10).boxed().map(x -> x + "hello").forEach(System.out::println);
		System.out.println("===============");

		// 강사님 스트림은 실무에서 어느때 선택하여 사용하는 건가요?
	}// end main

}// end class