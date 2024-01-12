package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test01Main4 {

	public static void main(String[] args) {
		System.out.println("java io..입출력");

		// 파일의 경로를 정확히 알고있을때~
		// C:\MULTI_EDU_20\javaWork\java21inputOutput\src\test\com\language.txt
		final String path = "C:\\MULTI_EDU_20\\javaWork\\java21inputOutput\\src\\test\\com\\language.txt";

		// 경로상의 파일의 존재유무를 확인하기.
		File file = new File(path);
		System.out.println(file.exists());// 존재하면 true반환
		System.out.println(file.isFile());// 파일이면 true반환
		System.out.println(file.isDirectory());// 디렉토리이면 true반환
		System.out.println("=====================");

		// 파일의 존재유무를 미리 체크해서 분기처리
		if (file.exists()) {
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
			} catch (FileNotFoundException e) {
				e.printStackTrace();
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
		} else {
			System.out.println("파일이름 또는 경로를 확인하세요..");
		}

		System.out.println("end main....");
	}// end main

}// end class
