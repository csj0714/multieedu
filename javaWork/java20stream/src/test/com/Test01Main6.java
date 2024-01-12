package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Test01Main6 {

	public static void main(String[] args) {
		System.out.println("Stream...스트림..");

		List<String> list = new ArrayList<String>();
		list.add("aaa1");
		list.add("aaa2");
		list.add("aaa3");
		System.out.println(list);

		// Stream에도 add()메소드로 데이터를 추가하는 기능있다.
		List<String> list2 = Stream.<String>builder().add("bbb1").add("bbb2").add("bbb3").build().toList();
		System.out.println(list2);

		// 임의의 문자열로 자동생성 가능[hello, hello, hello, hello, hello]
		System.out.println(Stream.generate(() -> "hello").limit(5).toList());

		// 임의의 정수로 자동생성[10, 10, 10, 10, 10]
		System.out.println(Stream.iterate(10, x -> x).limit(5).toList());
		// [5, 5, 5, 5, 5]
		System.out.println(Stream.iterate(5, x -> x).limit(5).toList());

		// [5, 25, 45, 65, 85]
		System.out.println(Stream.iterate(5, x -> x + 20).limit(5).toList());

		// 랜덤한 실수생성
		System.out.println(new Random().doubles(4).boxed().toList());

		// 랜덤한 정수생성
		System.out.println(new Random().ints(4).boxed().toList());

		// 문자열에서 구분자로 잘라서 리스트에 넣기
		String str = "aaa:bbb:ccc";
//		String[] arr = str.split(":");
		System.out.println(Arrays.asList(str.split(":")));
		System.out.println(Pattern.compile(":").splitAsStream(str).toList());

	}// end main

}// end class