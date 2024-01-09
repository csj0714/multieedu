package test.com;

import java.util.List;

public interface BoardDAO {
	public List<BoardVO> selectAll(BoardVO vo);

	public List<BoardVO> selectAll();
}
