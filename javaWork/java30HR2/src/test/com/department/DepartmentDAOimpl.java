package test.com.department;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.com.db.DBinfo;

public class DepartmentDAOimpl implements DepartmentDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public DepartmentDAOimpl() {
		System.out.println("DepartmentDAOimpl()....");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver successed...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<DepartmentVO> selectAll() {
		System.out.println("selectAll()...");
		List<DepartmentVO> vos = new ArrayList<DepartmentVO>();
		final String select_all = DepartmentSQL.SELECT_ALL_DEPARTMENT;
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			pstmt = conn.prepareStatement(select_all);
			System.out.println(pstmt);

			// 3.결과반환 rs >> vos
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				DepartmentVO vo2 = new DepartmentVO();
				vo2.setDepartment_id(rs.getInt("department_id"));
				vo2.setDepartment_name(rs.getString("department_name"));
				vo2.setManager_id(rs.getInt("manager_id"));
				vo2.setLocation_id(rs.getInt("location_id"));
				vos.add(vo2);
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
	public List<DepartmentJoinLocationVO> selectAllDepartmentJoinLocation() {
		System.out.println("selectAllDepartmentJoinLocation()...");
		List<DepartmentJoinLocationVO> vos = new ArrayList<DepartmentJoinLocationVO>();
		final String select_all = DepartmentSQL.SELECT_ALL_DEPARTMENT_JOIN_LOCATION;
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			pstmt = conn.prepareStatement(select_all);
			System.out.println(pstmt);

			// 3.결과반환 rs >> vos
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				DepartmentJoinLocationVO vo2 = new DepartmentJoinLocationVO();
				vo2.setDepartment_id(rs.getInt("department_id"));
				vo2.setDepartment_name(rs.getString("department_name"));
				vo2.setManager_id(rs.getInt("manager_id"));
				vo2.setLocation_id(rs.getInt("location_id"));
				vo2.setCity(rs.getString("city"));
				vos.add(vo2);
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
