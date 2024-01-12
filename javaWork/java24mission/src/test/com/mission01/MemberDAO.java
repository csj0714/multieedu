package test.com.mission01;

import java.util.List;

public interface MemberDAO {
	public MemberVO selectOne(MemberVO m);

	public List<MemberVO> selectAll();

	public int insert(MemberVO m);

	public int update(MemberVO m);

	public int delete(MemberVO m);

	public List<MemberVO> searchList(String searchKey, String searchItem);
}
