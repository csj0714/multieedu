package test.com;

import java.util.List;

public interface MemberDAO {
	public int insert(MemberVO m);

	public int update(MemberVO m);

	public int delete(MemberVO m);

	public MemberVO selectOne(MemberVO m);

	public List<MemberVO> selectAll();

	public List<MemberVO> searchList(String searchKey, String searchWord);
}
