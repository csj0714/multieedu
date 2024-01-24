package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.com.db.DBinfo;

public class EmpDetailsViewDAOimpl implements EmpDetailsViewDAO{

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	public EmpDetailsViewDAOimpl() {
		System.out.println("EmpDetailsViewDAOimpl()....");

		try {
			Class.forName(DBinfo.DRIVER_NAME);
			System.out.println("driver successed...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public List<EmpDetailsViewVO> selectAll() {
		System.out.println("selectAll()...");
		List<EmpDetailsViewVO> vos = new ArrayList<EmpDetailsViewVO>();
		
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			pstmt = conn.prepareStatement(EmpDetailsViewSQL.SELECT_ALL);
			System.out.println(pstmt);

			// 3.결과반환 rs >> vos
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				EmpDetailsViewVO vo2 = new EmpDetailsViewVO();
				vo2.setEmployee_id(rs.getInt("employee_id"));
				vo2.setFirst_name(rs.getString("first_name"));
				vo2.setLast_name(rs.getString("last_name"));
				vo2.setJob_id(rs.getString("job_id"));
				vo2.setSalary(rs.getInt("salary"));
				vo2.setCommission_pct(rs.getDouble("commission_pct"));
				vo2.setManager_id(rs.getInt("manager_id"));
				vo2.setDepartment_id(rs.getInt("department_id"));
				vo2.setLocation_id(rs.getInt("location_id"));
				vo2.setCountry_id(rs.getString("country_id"));
				vo2.setDepartment_name(rs.getString("department_name"));
				vo2.setJob_title(rs.getString("job_title"));
				vo2.setCity(rs.getString("city"));
				vo2.setCountry_name(rs.getString("country_name"));
				vo2.setRegion_name(rs.getString("region_name"));
				vo2.setState_province(rs.getString("state_province"));
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
