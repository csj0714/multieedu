package test.com.board;

import java.util.List;

public interface BoardDAO {
	int insert(BoardVO vo);

	int update(BoardVO vo);

	int delete(BoardVO vo);

	List<BoardVO> selectAll();

	BoardVO selectOne(BoardVO vo);

	List<BoardVO> searchList(String searchKey, String searchWord);
}
