package test.com.mission02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOimpl implements BoardDAO {

	private List<BoardVO> vos;

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user_name = "JAVA";
	private final String password = "hi123456";

	public BoardDAOimpl() {
		System.out.println("BoardDAOimpl()....");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver successed...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int insert(BoardVO vo) {
		System.out.println("insert()....");
		System.out.println(vo);

		int flag = 0;

		final String insert = "insert into board(num,title,content,writer,wdate) "
				+ "values(seq_board.nextval,?,?,?,?)";

		try {
			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());
			pstmt.setString(4, vo.getWdate());
			System.out.println(pstmt);

			flag = pstmt.executeUpdate();
			System.out.println("flag:" + flag);
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
	public int update(BoardVO vo) {
		System.out.println("update()....");
		System.out.println(vo);

		int flag = 0;

		final String update = "update board set title=?,content=?,writer=? where num=?";

		try {
			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());
			pstmt.setInt(4, vo.getNum());
			System.out.println(pstmt);

			flag = pstmt.executeUpdate();
			System.out.println("flg:" + flag);

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
	public int delete(BoardVO vo) {
		System.out.println("delete()....");
		System.out.println(vo);

		int flag = 0;

		final String delete = "delete from board where num=?";
		try {

			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, vo.getNum());
			System.out.println(pstmt);

			flag = pstmt.executeUpdate();
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
	public BoardVO selectOne(BoardVO vo) {
		System.out.println("selectOne()....");
		System.out.println(vo);

		BoardVO vo2 = new BoardVO();

		final String select_one = "select * from board where num=?";
		try {

			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(select_one);
			pstmt.setInt(1, vo.getNum());
			System.out.println(pstmt);

			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				vo2.setNum(rs.getInt("num"));
				vo2.setTitle(rs.getString("title"));
				vo2.setContent(rs.getString("content"));
				vo2.setWriter(rs.getString("writer"));
				vo2.setWdate(rs.getString("wdate"));
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
	public List<BoardVO> selectAll() {
		System.out.println("selectAll()....");
		List<BoardVO> vos = new ArrayList<BoardVO>();

		final String select_all = "select * from board order by num asc";
		try {

			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(select_all);
			System.out.println(pstmt);

			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				BoardVO vo1 = new BoardVO();
				vo1.setNum(rs.getInt("num"));
				vo1.setTitle(rs.getString("title"));
				vo1.setContent(rs.getString("content"));
				vo1.setWriter(rs.getString("writer"));
				vo1.setWdate(rs.getString("wdate"));
				vos.add(vo1);
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
	public List<BoardVO> searchList(String searchKey, String searchWord) {
		System.out.println("searchList()....");
		System.out.println(searchKey);
		System.out.println(searchWord);
		String sql = "";
		if (searchKey.equals("id")) {

			sql = "select * from board where id like ?";
		} else if (searchKey.equals("title")) {

			sql = "select * from board where title like ?";
		}

		List<BoardVO> vos = new ArrayList<BoardVO>();

		final String select_all = sql;

		try {
			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(select_all);
			pstmt.setString(1, "%" + searchWord + "%");
			System.out.println(pstmt);

			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setNum(rs.getInt("num"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setWdate(rs.getString("wdate"));
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
