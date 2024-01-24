package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOimpl implements EmployeeDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user_name = "HR";
	private final String password = "hi123456";

	public EmployeeDAOimpl() {
		System.out.println("EmployeeDAOimpl()....");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver successed...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<EmployeeVO> selectAll() {
		System.out.println("selectAll()...");
		List<EmployeeVO> vos = new ArrayList<EmployeeVO>();
		final String select_all = "select * from employees order by employee_id";
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
				EmployeeVO vo2 = new EmployeeVO();
				vo2.setEmployee_id(rs.getInt("employee_id"));
				vo2.setFirst_name(rs.getString("first_name"));
				vo2.setLast_name(rs.getString("last_name"));
				vo2.setEmail(rs.getString("email"));
				vo2.setPhone_number(rs.getString("phone_number"));
				vo2.setHire_date(rs.getString("hire_date"));
				vo2.setJob_id(rs.getString("job_id"));
				vo2.setSalary(rs.getInt("salary"));
				vo2.setCommission_pct(rs.getDouble("commission_pct"));
				vo2.setManager_id(rs.getInt("manager_id"));
				vo2.setDepartment_id(rs.getInt("department_id"));
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
	public List<EmployeeJoinDepartmentVO> selectAllEmployeeJoinDepartment() {
		System.out.println("selectAll()...");
		List<EmployeeJoinDepartmentVO> vos = new ArrayList<EmployeeJoinDepartmentVO>();
		final String select_all = "select employee_id,first_name,last_name,email,"
				+ "phone_number,hire_date,job_id,salary," + "commission_pct,e.manager_id,"
				+ "e.department_id,department_name " + "from employees e join departments d "
				+ "on e.department_id = d.department_id " + "order by employee_id";
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
				EmployeeJoinDepartmentVO vo2 = new EmployeeJoinDepartmentVO();
				vo2.setEmployee_id(rs.getInt("employee_id"));
				vo2.setFirst_name(rs.getString("first_name"));
				vo2.setLast_name(rs.getString("last_name"));
				vo2.setEmail(rs.getString("email"));
				vo2.setPhone_number(rs.getString("phone_number"));
				vo2.setHire_date(rs.getString("hire_date"));
				vo2.setJob_id(rs.getString("job_id"));
				vo2.setSalary(rs.getInt("salary"));
				vo2.setCommission_pct(rs.getDouble("commission_pct"));
				vo2.setManager_id(rs.getInt("manager_id"));
				vo2.setDepartment_id(rs.getInt("department_id"));
				vo2.setDepartment_name(rs.getString("department_name"));
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
	public List<EmployeeJoinJobsVO> selectAllEmployeeJoinJobs() {
		System.out.println("selectAllEmployeeJoinJobs()...");
		List<EmployeeJoinJobsVO> vos = new ArrayList<EmployeeJoinJobsVO>();
		final String select_all = "select employee_id,first_name,last_name,email,phone_number,"
				+ "hire_date,e.job_id,salary,commission_pct,e.manager_id," + "e.department_id,job_title "
				+ "from employees e join jobs j " + "on e.job_id = j.job_id " + "order by employee_id";
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
				EmployeeJoinJobsVO vo2 = new EmployeeJoinJobsVO();
				vo2.setEmployee_id(rs.getInt("employee_id"));
				vo2.setFirst_name(rs.getString("first_name"));
				vo2.setLast_name(rs.getString("last_name"));
				vo2.setEmail(rs.getString("email"));
				vo2.setPhone_number(rs.getString("phone_number"));
				vo2.setHire_date(rs.getString("hire_date"));
				vo2.setJob_id(rs.getString("job_id"));
				vo2.setSalary(rs.getInt("salary"));
				vo2.setCommission_pct(rs.getDouble("commission_pct"));
				vo2.setManager_id(rs.getInt("manager_id"));
				vo2.setJob_id(rs.getString("job_id"));
				vo2.setJob_title(rs.getString("job_title"));
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
	public List<EmployeeJoinDepartmentJoinJobsVO> selectAllEmployeeJoinDepartmentJoinJobs() {
		System.out.println("selectAllEmployeeJoinDepartmentJoinJobs()");
		List<EmployeeJoinDepartmentJoinJobsVO> vos = new ArrayList<EmployeeJoinDepartmentJoinJobsVO>();
		final String select_all = "select employee_id,first_name,last_name,email,phone_number,"
				+ "hire_date,e.job_id,salary,commission_pct,e.manager_id,"
				+ "e.department_id,department_name ,job_title " + "from employees e join departments d "
				+ "on e.department_id = d.department_id " + "join jobs j " + "on e.job_id = j.job_id "
				+ "order by employee_id";
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
				EmployeeJoinDepartmentJoinJobsVO vo2 = new EmployeeJoinDepartmentJoinJobsVO();
				vo2.setEmployee_id(rs.getInt("employee_id"));
				vo2.setFirst_name(rs.getString("first_name"));
				vo2.setLast_name(rs.getString("last_name"));
				vo2.setEmail(rs.getString("email"));
				vo2.setPhone_number(rs.getString("phone_number"));
				vo2.setHire_date(rs.getString("hire_date"));
				vo2.setJob_id(rs.getString("job_id"));
				vo2.setSalary(rs.getInt("salary"));
				vo2.setCommission_pct(rs.getDouble("commission_pct"));
				vo2.setManager_id(rs.getInt("manager_id"));
				vo2.setJob_id(rs.getString("job_id"));
				vo2.setJob_title(rs.getString("job_title"));
				vo2.setDepartment_name(rs.getString("department_name"));
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
