package test.com;

import java.util.ArrayList;
import java.util.List;

public class BoardDAOimpl implements BoardDAO {

	@Override
	public List<BoardVO> selectAll(BoardVO vo) {
		System.out.println("selectAll()");
		System.out.println(vo);

		List<BoardVO> list = new ArrayList<BoardVO>();

		for (int i = 0; i < 5; i++) {
			BoardVO vo2 = new BoardVO();
			vo2.setNum(11 + i);
			vo2.setTitle("java11" + i);
			vo2.setContent("hello11" + i);
			vo2.setWriter("kim11" + i);
			vo2.setWdate("2024-01-1" + i);

			list.add(vo2);
		}

		return list;
	}

	@Override
	public List<BoardVO> selectAll() {
		System.out.println("selectAll()2");

		List<BoardVO> list = new ArrayList<BoardVO>();

		for (int i = 0; i < 5; i++) {
			BoardVO vo2 = new BoardVO();
			vo2.setNum(11 + i);
			vo2.setTitle("java11" + i);
			vo2.setContent("hello11" + i);
			vo2.setWriter("kim11" + i);
			vo2.setWdate("2024-01-1" + i);

			list.add(vo2);
		}

		return list;
	}

}
