package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.com.db.DBinfo;

public class EmployeeDAOimpl implements EmployeeDAO {

	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	public EmployeeDAOimpl() {
		System.out.println("EmployeeDAOimpl()....");

		try {
			Class.forName(DBinfo.DRIVER_NAME);
			System.out.println("driver successed...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public List<EmployeeVO> selectAll(int cpage, int pageBlock) {
		System.out.println("selectAll()...");
		System.out.println("cpage:"+cpage+",pageBlock:"+pageBlock);
		int startRow = (cpage-1)*pageBlock + 1;
		int endRow = startRow + pageBlock -1;
		System.out.println(startRow+","+ endRow);
		
		
		
		List<EmployeeVO> vos = new ArrayList<EmployeeVO>();
		
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			pstmt = conn.prepareStatement(EmployeeSQL.SELECT_ALL_PAGE_BLOCK);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
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
		
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			pstmt = conn.prepareStatement(EmployeeSQL.SELECT_ALL_EMP_DEPT);
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
	public List<EmployeeJoinJobVO> selectAllEmployeeJoinJob() {
		System.out.println("selectAll()...");
		List<EmployeeJoinJobVO> vos = new ArrayList<EmployeeJoinJobVO>();
		
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			pstmt = conn.prepareStatement(EmployeeSQL.SELECT_ALL_EMP_JOB);
			System.out.println(pstmt);

			// 3.결과반환 rs >> vos
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				EmployeeJoinJobVO vo2 = new EmployeeJoinJobVO();
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
	public List<EmployeeJoinDepartmentJoinJobVO> selectAllEmployeeJoinDepartmentJoinJob() {
		System.out.println("selectAll()...");
		List<EmployeeJoinDepartmentJoinJobVO> vos = new ArrayList<EmployeeJoinDepartmentJoinJobVO>();
		
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			pstmt = conn.prepareStatement(EmployeeSQL.SELECT_ALL_EMP_DEPT_JOB);
			System.out.println(pstmt);

			// 3.결과반환 rs >> vos
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				EmployeeJoinDepartmentJoinJobVO vo2 = new EmployeeJoinDepartmentJoinJobVO();
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
	public int insert(EmployeeVO vo) {
		System.out.println("insert()....");
		System.out.println(vo);
		
		int flag = 0;
		
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			//first_name,last_name,email,phone_number,hire_date,
			//job_id,salary,commission_pct,manager_id,department_id
			pstmt = conn.prepareStatement(EmployeeSQL.INSERT);
			pstmt.setString(1, vo.getFirst_name());
			pstmt.setString(2, vo.getLast_name());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getPhone_number());
			pstmt.setString(5, vo.getHire_date());
			pstmt.setString(6, vo.getJob_id());
			pstmt.setInt(7, vo.getSalary());
			pstmt.setDouble(8, vo.getCommission_pct());
			pstmt.setInt(9, vo.getManager_id());
			pstmt.setInt(10, vo.getDepartment_id());
			System.out.println(pstmt);

			// 3.결과반환  flag
			flag = pstmt.executeUpdate();
			

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
	}//end insert


	@Override
	public int update(String name1, String name2) {
		System.out.println("update()...");
		System.out.println(name1);
		System.out.println(name2);
		
		int flag = 0;
		
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			pstmt = conn.prepareStatement(EmployeeSQL.UPDATE);
			pstmt.setString(1, name2.split(" ")[0]);
			pstmt.setString(2, name2.split(" ")[1]);
			pstmt.setString(3, name1.split(" ")[0]);
			pstmt.setString(4, name1.split(" ")[1]);
			
			System.out.println(pstmt);

			// 3.결과반환  flag
			flag = pstmt.executeUpdate();
			

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
	}//end update


	@Override
	public int delete(EmployeeVO vo) {
		System.out.println("delete()...");
		System.out.println(vo);
		
		int flag = 0;
		
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			pstmt = conn.prepareStatement(EmployeeSQL.DELETE);
			pstmt.setInt(1, vo.getEmployee_id());
			
			System.out.println(pstmt);

			// 3.결과반환  flag
			flag = pstmt.executeUpdate();
			

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
	}//end delete


	@Override
	public EmployeeVO selectOne(EmployeeVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo);
		
		EmployeeVO vo2 = new EmployeeVO();
		
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			pstmt = conn.prepareStatement(EmployeeSQL.SELECT_ONE);
			pstmt.setInt(1, vo.getEmployee_id());
			System.out.println(pstmt);

			// 3.결과반환 rs >> vos
			rs = pstmt.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
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
	}//end selectOne


	@Override
	public List<EmployeeVO> searchList(String searchKey, String searchWord) {
		System.out.println("searchList()....");
		System.out.println(searchKey);
		System.out.println(searchWord);
		
		String sql = "";
		if(searchKey.equals("name")) {
			sql = EmployeeSQL.SEARCHLIST_NAME;
		}else if(searchKey.equals("job_id")) {
			sql = EmployeeSQL.SEARCHLIST_JOB_ID;
		}else if(searchKey.equals("tel")) {
			sql = EmployeeSQL.SEARCHLIST_TEL;
		}
		
		
		List<EmployeeVO> vos =  new ArrayList<EmployeeVO>();
		
		try {
			// 1.커넥션(계정접속)
			conn = DriverManager.getConnection(DBinfo.URL, DBinfo.USER_NAME, DBinfo.PASSWORD);
			System.out.println("conn successed...");

			// 2.SQL(질의문) 세팅
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+searchWord+"%");
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

}//end class
