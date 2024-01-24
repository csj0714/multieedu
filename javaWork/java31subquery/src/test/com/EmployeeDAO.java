package test.com;

import java.util.List;

public interface EmployeeDAO {

	public int insert(EmployeeVO vo);

	public int update(String name1, String name2);

	public int delete(EmployeeVO vo);

	public List<EmployeeVO> selectAll(int cpage, int pageBlock);

	public List<EmployeeJoinDepartmentVO> selectAllEmployeeJoinDepartment();

	// emp+job
	public List<EmployeeJoinJobVO> selectAllEmployeeJoinJob();

	// emp+dept+job
	public List<EmployeeJoinDepartmentJoinJobVO> selectAllEmployeeJoinDepartmentJoinJob();

	public EmployeeVO selectOne(EmployeeVO vo);

	public List<EmployeeVO> searchList(String searchKey, String searchWord);

}
