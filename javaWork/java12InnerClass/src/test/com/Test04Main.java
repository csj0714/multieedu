package test.com;

import java.util.ArrayList;
import java.util.List;

public class Test04Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardVO vo = new BoardVO();
		vo.setNum(1);
		vo.setTitle("java11");
		vo.setContent("hello11");
		vo.setWriter("kim11");
		vo.setWdate("2024-01-11");

		BoardDAO dao = new BoardDAOimpl();
		List<BoardVO> list = dao.selectAll(vo);
		System.out.println("list.size(): " + list.size());

		for (BoardVO x : list) {
			System.out.println(x);
		}

		list = dao.selectAll();

		System.out.println("list.size(): " + list.size());

		for (BoardVO x : list) {
			System.out.println(x);
		}
	}

}
