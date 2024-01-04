package test.com;

import java.io.UnsupportedEncodingException;

public class Test03String {

	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println("String....");

		String txt = "abcdefg";

		// 문자열의 길이
		System.out.println("length : " + txt.length());

		// 문자열에서 한글자씩 뽑기
		for (int i = 0; i < txt.length(); i++) {
			System.out.println("charAt : " + txt.charAt(i));
		}

		// 문자열 비교, 대소문자 구분없이 비교 등등.
		System.out.println(txt.compareTo("abcdefg") == 0);
		System.out.println(txt.compareToIgnoreCase("abcdeFG") == 0);
		System.out.println(txt.equals("abcdefg"));
		System.out.println(txt.equalsIgnoreCase("abcdeFG"));

		// 문장에서 찾고자 하는 단어의 위치(포지션)을 반환
		System.out.println("indexOf : " + txt.indexOf("a"));
		System.out.println("indexOf : " + txt.indexOf("b"));
		System.out.println("indexOf : " + txt.indexOf("bcd"));

		txt = "무궁.화 꽃이. 피었습니다.";

		System.out.println(txt.substring(4));
		System.out.println(txt.substring(4, 4 + 1));
		System.out.println(txt.substring(txt.indexOf("꽃"), txt.indexOf("꽃") + 1));

		System.out.println("startsWith : " + txt.startsWith("무궁화"));
		System.out.println("endsWith : " + txt.endsWith("무궁화"));

		System.out.println("concat : " + txt.concat("오징어게임"));
		System.out.println("hashCode : " + txt.hashCode());
		System.out.println("lastIndexOf : " + txt.lastIndexOf("."));

		txt = "java javascript html css";
		System.out.println(txt.replace("java", "JAVA"));
		txt = txt.replace("java", "JAVA");
		System.out.println(txt);

		String[] arr = txt.split(" ");
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("contains : " + txt.contains("sc"));

		byte[] bs = txt.getBytes("utf-8");
		for (int i = 0; i < bs.length; i++) {
			System.out.println(bs[i]);
		}

		System.out.println(txt.toLowerCase());
		System.out.println(txt.toUpperCase());

	}// end main

}// end class
