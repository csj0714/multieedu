package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {

	private List<MemberVO> vos;

	public MemberDAOimpl() {
		System.out.println("MemberDAOimpl()....");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver successed...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public int insert(MemberVO vo) {
		System.out.println("insert()....");
		System.out.println(vo);

		int flag = 0;
		vos.add(vo);
		flag = 1;

		return flag;
	}

	@Override
	public int update(MemberVO vo) {
		System.out.println("update()....");
		System.out.println(vo);

		for (int i = 0; i < vos.size(); i++) {
			if (vo.getNum() == vos.get(i).getNum()) {
				vos.set(i, vo);
				return 1;
			}
		}

		return 0;
	}

	@Override
	public int delete(MemberVO vo) {
		System.out.println("delete()....");
		System.out.println(vo);

		int flag = 0;

		for (int i = 0; i < vos.size(); i++) {
			if (vo.getNum() == vos.get(i).getNum()) {
				vos.remove(i);
				flag = 1;
			}
		}

		return flag;
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		System.out.println("selectOne()....");
		System.out.println(vo);

		MemberVO vo2 = new MemberVO();
		for (int i = 0; i < vos.size(); i++) {
			// 전달받은 회원번호와 전역vos에있는 회원번호가 같다면~~~
			if (vo.getNum() == vos.get(i).getNum()) {
				vo2 = vos.get(i);
//				return vos.get(i);
			}
		}
		return vo2;
	}

	@Override
	public List<MemberVO> selectAll() {
		System.out.println("selectAll()....");
		List<MemberVO> vos = new ArrayList<MemberVO>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		final String user_name = "JAVA";
		final String password = "hi123456";
		final String select_all = "select * from member";
		try {
			conn = DriverManager.getConnection(url, user_name, password);

			System.out.println("conn successed...");
			pstmt = conn.prepareStatement(select_all);
			System.out.println(pstmt);

			rs = pstmt.executeQuery();
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return vos;
	}

	@Override
	public List<MemberVO> searchList(String searchKey, String searchWord) {
		System.out.println("searchList()....");
		System.out.println(searchKey);
		System.out.println(searchWord);

		List<MemberVO> vos2 = new ArrayList<MemberVO>();

		for (int i = 0; i < vos.size(); i++) {
			if (searchKey.equals("id")) {
				if (vos.get(i).getId().contains(searchWord)) {
//					System.out.println(vos.get(i));
					vos2.add(vos.get(i));
				}
			} else if (searchKey.equals("name")) {
				if (vos.get(i).getName().contains(searchWord)) {
//					System.out.println(vos.get(i));
					vos2.add(vos.get(i));
				}
			}
		}

		return vos2;
	}

}
