package test.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> list = Arrays.asList(11, 22, 33.33, new Integer[] { 11, 22 }, "hello", new TestVO());

		List<?> list2 = Arrays.asList(11, 22, 33.33, new Integer[] { 11, 22 }, "hello", new TestVO());

		List<TestVO> list3 = Arrays.asList(new TestVO());

		List<String> list4 = Arrays.asList("hello");

		List<Integer> list5 = Arrays.asList(11, 22);

		List<Double> list6 = Arrays.asList(33.33);

		List<Number> list7 = Arrays.asList(11, 22, 33.33);

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("age", 33);

	}

}
