package test.com;

public class Test04StringBuffer {

	public static void main(String[] args) {
		System.out.println("StringBuffer");

		// StringBuffer or StringBuilder
		// 대용량문자열 처리에 유리하다.
//		StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append("hello");
		sb.append("hello");
		sb.append("hello");
		sb.append("hello");
		sb.append("hello");
		System.out.println(sb.length());
		System.out.println(sb.toString());

		String str = "";
		str += "hello";
		str += "hello";
		str += "hello";
		str += "hello";
		str += "hello";
		str += "hello";
		System.out.println(str.length());
		System.out.println(str);

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 200000; i++) {
//			str += "hello";
			sb.append("hello");
		}
//		System.out.println(str.length());
		System.out.println(sb.length());
		System.out.println(System.currentTimeMillis() - startTime);

	}// end main

}// end class