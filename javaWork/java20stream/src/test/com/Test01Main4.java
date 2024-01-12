package test.com;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test01Main4 {

	public static void main(String[] args) {
		System.out.println("Stream...스트림..");

		System.out.println(IntStream.range(0, 10).boxed().toList());
		System.out.println(IntStream.range(0, 10).boxed().collect(Collectors.toList()));

		IntStream.range(0, 10).boxed().forEach(System.out::print);
		IntStream.range(0, 10).boxed().forEach(System.out::println);
		System.out.println("===============");
		// 2의 배수만 출력
		IntStream.range(0, 10).boxed().filter(x -> x % 2 == 0).forEach(System.out::println);

	}// end main

}// end class