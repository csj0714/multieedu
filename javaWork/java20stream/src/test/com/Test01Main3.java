package test.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test01Main3 {

	public static void main(String[] args) {
		System.out.println("Stream...스트림..");

		List<Double> list = Arrays.asList(1.1, 2.2, 3.3, 4.4);

		System.out.println(list.stream().filter(x -> x * 10 >= 20).toList());
		System.out.println(list.stream().filter(x -> x * 10 >= 20).count());
		System.out.println("==============");

		System.out.println(list.stream().mapToDouble(x -> x).min().getAsDouble());
		System.out.println(list.stream().mapToDouble(x -> x).max().getAsDouble());
		System.out.println(list.stream().mapToDouble(x -> x).sum());

	}// end main

}// end class