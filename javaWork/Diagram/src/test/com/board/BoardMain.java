package test.com.board;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardVO vo = new BoardVO();
		BoardDAO dao = new BoardDAOimpl();
		int result = dao.insert(vo);
		System.out.println(result);

		result = dao.update(vo);
		System.out.println(result);
		result = dao.delete(vo);
		System.out.println(result);

		BoardVO result2 = dao.selectOne(vo);

		System.out.println(result2);

		List<BoardVO> list = new ArrayList<BoardVO>();

	}

}
