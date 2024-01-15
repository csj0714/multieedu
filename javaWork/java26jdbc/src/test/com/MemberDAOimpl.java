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

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user_name = "JAVA";
	private final String password = "hi123456";

	public MemberDAOimpl() {
		System.out.println("MemberDAOimpl()....");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver successed...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public int insert(MemberVO vo) {
		System.out.println("insert()....");
		System.out.println(vo);

		int flag = 0;
		// insert into member(num,id,pw,name,tel)
		// values(seq_member.nextval,?,?,?,?)
		final String insert = "insert into member(num,id,pw,name,tel) " + "values(seq_member.nextval,?,?,?,?)";
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			// select * from member
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getTel());
			System.out.println(pstmt);

			// 3.결과반환 정수 >> flag
			flag = pstmt.executeUpdate(); // DML: insert,update,delete
			System.out.println("flag:" + flag);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally

		return flag;
	}

	@Override
	public int update(MemberVO vo) {
		System.out.println("update()....");
		System.out.println(vo);

		int flag = 0;

		// update member set pw='hi111',name='lee',tel='02' where num=2
		final String update = "update member set pw=?,name=?,tel=? where num=?";
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			// select * from member
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, vo.getPw());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getTel());
			pstmt.setInt(4, vo.getNum());
			System.out.println(pstmt);

			// 3.결과반환 정수 >> flag
			flag = pstmt.executeUpdate(); // DML: insert,update,delete
			System.out.println("flag:" + flag);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally

		return flag;
	}

	@Override
	public int delete(MemberVO vo) {
		System.out.println("delete()....");
		System.out.println(vo);

		int flag = 0;

		final String delete = "delete from member where num=?";
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			// select * from member
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, vo.getNum());
			System.out.println(pstmt);

			// 3.결과반환 정수 >> flag
			flag = pstmt.executeUpdate(); // DML: insert,update,delete
			System.out.println("flag:" + flag);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally

		return flag;
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		System.out.println("selectOne()....");
		System.out.println(vo);

		// select * from member where num=6

		MemberVO vo2 = new MemberVO();

		final String select_one = "select * from member where num=?";
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			// select * from member
			pstmt = conn.prepareStatement(select_one);
			pstmt.setInt(1, vo.getNum());
			System.out.println(pstmt);

			// 3.결과반환 rs >> vos
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				vo2.setNum(rs.getInt("num"));
				vo2.setId(rs.getString("id"));
				vo2.setPw(rs.getString("pw"));
				vo2.setName(rs.getString("name"));
				vo2.setTel(rs.getString("tel"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally

		return vo2;
	}

	@Override
	public List<MemberVO> selectAll() {
		System.out.println("selectAll()....");
		List<MemberVO> vos = new ArrayList<MemberVO>();

		final String select_all = "select * from member order by num asc";
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			// select * from member
			pstmt = conn.prepareStatement(select_all);
			System.out.println(pstmt);

			// 3.결과반환 rs >> vos
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setNum(rs.getInt("num"));
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vos.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally

		return vos;
	}

	@Override
	public List<MemberVO> searchList(String searchKey, String searchWord) {
		System.out.println("searchList()....");
		System.out.println(searchKey);
		System.out.println(searchWord);
		String sql = "";
		if (searchKey.equals("id")) {
			// select * from member where id like '%ad%'
			sql = "select * from member where id like ?";
		} else if (searchKey.equals("name")) {
			// select * from member where name like '%ki%'
			sql = "select * from member where name like ?";
		}

		List<MemberVO> vos = new ArrayList<MemberVO>();

		final String select_all = sql;

		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			// select * from member
			pstmt = conn.prepareStatement(select_all);
			pstmt.setString(1, "%" + searchWord + "%");
			System.out.println(pstmt);

			// 3.결과반환 rs >> vos
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setNum(rs.getInt("num"));
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vos.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally

		return vos;
	}

}