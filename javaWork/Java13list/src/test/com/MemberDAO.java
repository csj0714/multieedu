package test.com;

import java.util.List;

public interface MemberDAO {
	public List<MemberVO> selectAll(MemberVO m);

	public List<MemberVO> selectAll();
}
