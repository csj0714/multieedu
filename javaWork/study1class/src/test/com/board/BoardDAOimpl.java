package test.com.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.com.db.DBinfo;

public class BoardDAOimpl implements BoardDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public BoardDAOimpl() {
		System.out.println("BoardDAOimpl()...");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver successed...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int insert(BoardVO vo) {
		System.out.println("insert()...");
		System.out.println(vo);
		int flag = 0;
		try {
			// 커넥션 계정접속
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn.successed...");
			// SQL 질의문 세팅
			pstmt = conn.prepareStatement(BoardSQL.INSERT);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());
			System.out.println(pstmt);

			flag = pstmt.executeUpdate();
			System.out.println("flag : " + flag);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return flag;
	}

	@Override
	public int update(BoardVO vo) {
		System.out.println("update()...");
		System.out.println(vo);
		int flag = 0;
		try {
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(BoardSQL.UPDATE);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());
			pstmt.setInt(4, vo.getNum());
			System.out.println(pstmt);

			flag = pstmt.executeUpdate();
			System.out.println("flag : " + flag);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return flag;
	}

	@Override
	public int delete(BoardVO vo) {
		System.out.println("delete()...");
		System.out.println(vo);
		int flag = 0;
		try {
			// 커넥션 계정접속
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn sucessed...");
			// sql문 세팅
			pstmt = conn.prepareStatement(BoardSQL.DELETE);
			pstmt.setInt(1, vo.getNum());

			System.out.println(pstmt);
			flag = pstmt.executeUpdate();
			System.out.println("flag : " + flag);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return flag;
	}

	@Override
	public List<BoardVO> selectAll() {
		System.out.println("selectAll()...");

		List<BoardVO> vos = new ArrayList<BoardVO>();

		try {
			// conn 연결 설정
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");
			// sql 질의문 세팅
			pstmt = conn.prepareStatement(BoardSQL.SELECT_ALL);
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setNum(rs.getInt("num"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setWdate(rs.getTimestamp("wdate"));
				vos.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return vos;
	}

	@Override
	public BoardVO selectOne(BoardVO vo) {
		System.out.println("selectOne()...");
		BoardVO vo2 = new BoardVO();
		try {
			// conn 연결 설정
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");
			// sql문 질의문 세팅
			pstmt = conn.prepareStatement(BoardSQL.SELECT_ONE);
			pstmt.setInt(1, vo.getNum());
			System.out.println(pstmt);
			// 결과 반환 rs
			rs = pstmt.executeQuery();
			while (rs.next()) {

				vo2.setNum(rs.getInt("num"));
				vo2.setTitle(rs.getString("title"));
				vo2.setContent(rs.getString("content"));
				vo2.setWriter(rs.getString("writer"));
				vo2.setWdate(rs.getTimestamp("wdate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo2;
	}

	@Override
	public List<BoardVO> searchList(String searchKey, String searchWord) {
		System.out.println("searchList()...");

		List<BoardVO> vos = new ArrayList<BoardVO>();

		try {
			// conn 연결 설정
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			// sql 질의문 세팅
			if (searchKey.equals("title")) {
				pstmt = conn.prepareStatement(BoardSQL.SEARCHLIST_TITLE);
			} else if (searchKey.equals("content")) {
				pstmt = conn.prepareStatement(BoardSQL.SEARCHLIST_CONTENT);
			} else {
				pstmt = conn.prepareStatement("select * from board where writer Like ? order by num desc");
			}
			pstmt.setString(1, "%" + searchWord + "%");
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setNum(rs.getInt("num"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setWdate(rs.getTimestamp("wdate"));
				vos.add(vo);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vos;
	}

}
