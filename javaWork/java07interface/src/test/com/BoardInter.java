package test.com;

public interface BoardInter {

	public int update(BoardVO vo);

	public BoardVO[] searchList(BoardVO vo);

	public BoardVO[] searchList2(String searchKey, String searchWord);
}
