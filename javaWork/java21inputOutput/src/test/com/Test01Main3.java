package test.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test01Main3 {

	public static void main(String[] args) {
		System.out.println("java io..입출력");

		// 파일의 경로를 정확히 알고있을때~
		// C:\MULTI_EDU_20\javaWork\java21inputOutput\src\test\com\language.txt
//		String path = "C:\\MULTI_EDU_20\\javaWork\\java21inputOutput\\src\\test\\com\\language.txt";

		// 파일의 경로는 모르지만 파일명을 알고있다.
		Class<?> clazz = Test01Main3.class;
		String path = clazz.getResource("language.txt").getPath();
		System.out.println(path);

		// 시스템 콘솔이 아니고 파일에서 텍스트 입력받기
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			// 파일내용을 하나의 문자열에 추가하기
			// 파일의 내용이 많을것을 대비해서 스트링버퍼를 사용하는것이 유리하다.
			StringBuilder sb = new StringBuilder();
			while (true) {
				String txt = br.readLine();
				if (txt == null)
					break;
				sb.append(txt);
				System.out.println(txt);
			}

			System.out.println(sb.toString().length());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		} // end finally

	}// end main

}// end class