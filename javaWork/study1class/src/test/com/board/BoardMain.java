package test.com.board;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardDAO dao = new BoardDAOimpl();
		BoardVO vo = new BoardVO();
//		vo.setTitle("hello1");
//		vo.setContent("hi1");
//		vo.setWriter("kim1");
//		int result = dao.insert(vo);
//		System.out.println(result);

//		vo.setNum(3);
//		vo.setTitle("java7777");
//		vo.setContent("bye2");
//		vo.setWriter("lee");
//		int result = dao.update(vo);
//		System.out.println(result);

//		vo.setNum(2);
//		int result = dao.delete(vo);
//		System.out.println(result);

		List<BoardVO> vos = dao.selectAll();
		for (BoardVO x : vos) {
			System.out.println(x);
		}
		System.out.println("==============");
		vo.setNum(30);

		BoardVO vo2 = dao.selectOne(vo);
		System.out.println(vo2);
		System.out.println("=============");

		vos = dao.searchList("title", "java");
		for (BoardVO x : vos) {
			System.out.println(x);
		}
		System.out.println("=============");
		vos = dao.searchList("content", "hi");
		for (BoardVO x : vos) {
			System.out.println(x);
		}
		System.out.println("==============");
		vos = dao.searchList("writer", "kim");
		for (BoardVO x : vos) {
			System.out.println(x);
		}

	}

}
