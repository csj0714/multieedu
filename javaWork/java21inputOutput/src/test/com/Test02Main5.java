package test.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Test02Main5 {

	public static void main(String[] args) {
		System.out.println("java.io ... 출력...output");

		String fileName = "listvos.txt";// List<TestVO>

		// 객체로 저장된 파일을 읽어오자~~~(인풋)

		File file = new File(fileName);
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			@SuppressWarnings("unchecked")
			List<TestVO> vos = (List<TestVO>) ois.readObject();
			for (TestVO x : vos) {
				System.out.println(x);
			}

			System.out.println("ois successed...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}// end main

}// end class