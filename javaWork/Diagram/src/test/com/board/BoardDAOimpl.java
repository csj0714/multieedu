package test.com.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDAOimpl implements BoardDAO {

	@Override
	public int insert(BoardVO vo) {
		// TODO Auto-generated method stub
		return vo.getNum();
	}

	@Override
	public int update(BoardVO vo) {
		// TODO Auto-generated method stub
		return vo.getNum();
	}

	@Override
	public int delete(BoardVO vo) {
		// TODO Auto-generated method stub
		return vo.getNum();
	}

	@Override
	public BoardVO selectOne(BoardVO vo) {
		vo.setNum(1);
		vo.setTitle("asd");
		vo.setContent("as123");
		vo.setWriter("홍길동");
		vo.setWdate("010");
		return vo;
	}

	@Override
	public List<BoardVO> selectAll() {
		// TODO Auto-generated method stub

		List<BoardVO> list = new ArrayList<BoardVO>();
		for (int i = 0; i < 5; i++) {
			BoardVO vo = new BoardVO();
			vo.setNum(1);
			vo.setTitle("asd");
			vo.setContent("as123");
			vo.setWriter("홍길동");
			vo.setWdate("010");
			list.add(vo);
		}
		return list;
	}

	@Override
	public List<BoardVO> searchList(String searchKey, String searchWord) {
		// TODO Auto-generated method stub
		List<BoardVO> list = new ArrayList<BoardVO>();

		return list;
	}

}
