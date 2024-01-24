package test.com;

import java.util.List;

public interface EmployeeDAO {

	public List<EmployeeVO> selectAll();

	public List<EmployeeJoinDepartmentVO> selectAllEmployeeJoinDepartment();

	public List<EmployeeJoinJobsVO> selectAllEmployeeJoinJobs();

	public List<EmployeeJoinDepartmentJoinJobsVO> selectAllEmployeeJoinDepartmentJoinJobs();
}
