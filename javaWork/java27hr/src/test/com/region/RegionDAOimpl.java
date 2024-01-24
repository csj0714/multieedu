package test.com.region;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RegionDAOimpl implements RegionDAO {

	private List<RegionVO> vos;

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user_name = "HR";
	private final String password = "hi123456";

	public RegionDAOimpl() {
		System.out.println("RegionDAOimpl()....");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver successed...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public List<RegionVO> selectAll() {
		System.out.println("selectAll()....");
		List<RegionVO> vos = new ArrayList<RegionVO>();

		final String select_all = "select * from regions order by region_id asc";

		try {
			conn = DriverManager.getConnection(url, user_name, password);
			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(select_all);
			System.out.println(pstmt);

			rs = pstmt.executeQuery();
			System.out.println(rs);

			while (rs.next()) {
				RegionVO vo = new RegionVO();
				vo.setRagionId(rs.getInt("region_id"));
				vo.setRegionName(rs.getString("region_name"));
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
