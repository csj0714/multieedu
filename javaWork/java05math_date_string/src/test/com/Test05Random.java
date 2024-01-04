package test.com;

import java.util.Random;

public class Test05Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Random");

		Random r = new Random();
		System.out.println(r.nextBoolean());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(45));
		System.out.println(r.nextDouble());
		System.out.println(r.nextDouble(100));

		// java css javascript html jsp spring를 배열에 넣으세요
		// 랜덤함수를 이용해서 배열에 들어있는 문자열을 뽑아서 출력하는 스테틱함수를
		// 작성하세요
		String[] strs = new String[] { "java", "css", "javascript", "html", "jsp", "spring" };

		printRandom(strs);

	}// end main

	// 함수정의부
	static void printRandom(String[] strs) {
		System.out.println("printRandom()....");
		Random r = new Random();
		int index = r.nextInt(strs.length);
		System.out.println(strs[index]);
	}

}// end class
