package test.com.country;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CountryDAOimpl implements CountryDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user_name = "HR";
	private final String password = "hi123456";

	public CountryDAOimpl() {
		System.out.println("CountryDAOimpl()....");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver successed...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<CountryVO> selectAll() {
		System.out.println("selectAll()...");
		List<CountryVO> vos = new ArrayList<CountryVO>();
		final String select_all = "select * from countries order by country_id asc";
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
				CountryVO vo2 = new CountryVO();
				vo2.setCountry_id(rs.getString("country_id"));
				vo2.setCountry_name(rs.getString("country_name"));
				vo2.setRegion_id(rs.getInt("region_id"));
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
	public List<CountryJoinRegionVO> selectAllContryJoinRegion() {
		System.out.println("selectAllContryJoinRegion()...");
		List<CountryJoinRegionVO> vos = new ArrayList<CountryJoinRegionVO>();
		final String select_all = "select country_id,country_name,region_id,region_name "
				+ "from countries join regions " + "using(region_id) " + "order by country_id asc";
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
				CountryJoinRegionVO vo2 = new CountryJoinRegionVO();
				vo2.setCountry_id(rs.getString("country_id"));
				vo2.setCountry_name(rs.getString("country_name"));
				vo2.setRegion_id(rs.getInt("region_id"));
				vo2.setRegion_name(rs.getString("region_name"));
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
