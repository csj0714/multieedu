package test.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("java io..입출력");

		// C:\MULTI_EDU_20\javaWork\java21inputOutput\src\test\com\language.txt
		String path = "C:\\MULTI_EDU_20\\javaWork\\java21inputOutput\\src\\test\\com\\language.txt";

		// 시스템 콘솔이 아니고 파일에서 텍스트 입력받기
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			List<String> list = new ArrayList<String>();
			while (true) {
				String txt = br.readLine();
				if (txt == null)
					break;
				list.add(txt);
				System.out.println(txt);
			}

			System.out.println(list);
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