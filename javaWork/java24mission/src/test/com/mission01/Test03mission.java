package test.com.mission01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test03mission {

	public static void main(String[] args) {

		// MemberVO 객체를 List에 넣어서 파일로 작성하고
		// 해당파일을 읽어들이는 프로그램을 작성해보세요.
		// 파일명 : listmembers.txt

		String fileName = "listmembers.txt";

		// 저장하고 싶은 내용이 객체다~~~~~
		// 객체를 파일이나 네트워크를통한 원격지에 전송하고자할때 직렬화를 해줘야한다.
		// 객체직렬화 : 인터페이스Serializable 를 상속받으면된다.

		// 객체 여러개를 만들어서 사용해보자...
		List<MemberVO> vos = new ArrayList<MemberVO>();
		for (int i = 0; i < 10; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(11 + i);
			vo.setId("admin" + i);
			vo.setPw("hi1111" + i);
			vo.setName("kim" + i);
			vo.setTel("010" + i);

			vos.add(vo);
		}

		File file = new File(fileName);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(vos);

			oos.flush();
			System.out.println("oos successed...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}// end main

}// end class