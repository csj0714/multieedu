package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LocationDAOimpl implements LocationDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user_name = "HR";
	private final String password = "hi123456";
	
	public LocationDAOimpl() {
		System.out.println("LocationDAOimpl()....");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver successed...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<LocationVO> selectAll() {
		System.out.println("selectAll()...");
		List<LocationVO> vos = new ArrayList<LocationVO>();
		final String select_all = "select * from locations order by location_id asc";
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			pstmt = conn.prepareStatement(select_all);
			System.out.println(pstmt);

			// 3.결과반환 rs >> vos
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				LocationVO vo2 = new LocationVO();
				vo2.setLocation_id(rs.getInt("location_id"));
				vo2.setStreet_address(rs.getString("street_address"));
				vo2.setPostal_code(rs.getString("postal_code"));
				vo2.setCity(rs.getString("city"));
				vo2.setState_province(rs.getString("state_province"));
				vo2.setCountry_id(rs.getString("country_id"));
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
	public List<LocationJoinCountryVO> selectAllLocationJoinCountry() {
		System.out.println("selectAll()...");
		List<LocationJoinCountryVO> vos = new ArrayList<LocationJoinCountryVO>();
		final String select_all = "select location_id,street_address,postal_code,"
				+ "city,state_province,country_id,country_name "
				+ "from locations join countries "
				+ "using(country_id) "
				+ "order by location_id asc";
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			pstmt = conn.prepareStatement(select_all);
			System.out.println(pstmt);

			// 3.결과반환 rs >> vos
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				LocationJoinCountryVO vo2 = new LocationJoinCountryVO();
				vo2.setLocation_id(rs.getInt("location_id"));
				vo2.setStreet_address(rs.getString("street_address"));
				vo2.setPostal_code(rs.getString("postal_code"));
				vo2.setCity(rs.getString("city"));
				vo2.setState_province(rs.getString("state_province"));
				vo2.setCountry_id(rs.getString("country_id"));
				vo2.setCountry_name(rs.getString("country_name"));
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
