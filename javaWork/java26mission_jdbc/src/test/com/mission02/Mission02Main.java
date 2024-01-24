package test.com.mission02;

import java.util.List;

public class Mission02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mission02...board...jdbc");
		BoardDAO dao = new BoardDAOimpl();
		System.out.println("============");
		List<BoardVO> vos = dao.selectAll();
		for (BoardVO x : vos) {
			System.out.println(x);
		}
		System.out.println("===name=============");
		vos = dao.searchList("title", "java");
		for (BoardVO x : vos) {
			System.out.println(x);
		}
		System.out.println("================");

		BoardVO vo = new BoardVO();
		vo.setNum(5);

		BoardVO vo2 = dao.selectOne(vo);
		System.out.println("vo2:" + vo2);
		System.out.println("================");

//		vo = new MemberVO();
//		vo.setNum(8);
//		vo.setPw("hi8888");
//		vo.setName("kim888");
//		vo.setTel("0888");

//		vo = new BoardVO();
//		vo.setTitle("java2");
//		vo.setContent("hi1111");
//		vo.setWriter("yang11");
//		vo.setWdate("0");
//		int result = dao.insert(vo);
//		System.out.println("result:" + result);
//		System.out.println("================");

		vo = new BoardVO();
		vo.setNum(9);

		int result = dao.delete(vo);
		System.out.println("result:" + result);
		System.out.println("================");

	}// end main

}// end class
