package test.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test01Main2 {

	public static void main(String[] args) {
		System.out.println("Stream...스트림..");

		List<Double> list = Arrays.asList(1.1, 2.2, 3.3, 4.4);

		System.out.println(list.stream().filter(x -> x * 10 >= 20).toList());
		System.out.println(list.stream().filter(x -> x * 10 >= 20).count());
		System.out.println("==============");

		Double[] ds = new Double[] { 1.1, 2.2, 3.3, 4.4 };
		List<Double> list2 = Arrays.asList(ds);
		System.out.println(list2.stream().filter(x -> x * 10 >= 20).toList());
		System.out.println(list2.stream().filter(x -> x * 10 >= 20).count());
		System.out.println("==============");

		double[] ds2 = new double[] { 1.1, 2.2, 3.3, 4.4 };

		System.out.println(Arrays.stream(ds2).filter(x -> x * 10 >= 20).boxed().collect(Collectors.toList()));
		System.out.println(Arrays.stream(ds2).filter(x -> x * 10 >= 20).boxed().toList());
		System.out.println(list2.stream().filter(x -> x * 10 >= 20).count());
		System.out.println("==============");

	}// end main

}// end class