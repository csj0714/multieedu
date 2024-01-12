package test.com.mission01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Test03mission2 {

	public static void main(String[] args) {

		// MemberVO 객체를 List에 넣어서 파일로 작성하고
		// 해당파일을 읽어들이는 프로그램을 작성해보세요.
		// 파일명 : listmembers.txt

		String fileName = "listmembers.txt";// List<TestVO>

		// 객체로 저장된 파일을 읽어오자~~~(인풋)

		File file = new File(fileName);
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			@SuppressWarnings("unchecked")
			List<MemberVO> vos = (List<MemberVO>) ois.readObject();
			for (MemberVO x : vos) {
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