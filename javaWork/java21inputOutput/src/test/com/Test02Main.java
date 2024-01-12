package test.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("java.io ... 출력...output");

		// 콘솔output이 아니고 파일에 output을 해보자.

		String fileName = "hello.txt";

		File file = new File(fileName);
		FileOutputStream fos = null;
		PrintStream ps = null;

		try {
			fos = new FileOutputStream(file);
			ps = new PrintStream(fos);

			ps.print("Hello\n");
			ps.printf("java %d,%s\n", 100, "kim");
			ps.println("web1");
			ps.println("web2");

			for (int i = 0; i < 5; i++) {
				ps.println("jsp " + i);
			}

			ps.flush();
			System.out.println("ps successed...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}