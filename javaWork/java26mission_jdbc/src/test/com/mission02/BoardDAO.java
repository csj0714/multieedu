package test.com.mission02;

import java.util.List;

public interface BoardDAO {
	public List<BoardVO> selectAll();

	public BoardVO selectOne(BoardVO vo);

	public int insert(BoardVO vo);

	public int update(BoardVO vo);

	public int delete(BoardVO vo);

	public List<BoardVO> searchList(String searchKey, String searchWord);
}
