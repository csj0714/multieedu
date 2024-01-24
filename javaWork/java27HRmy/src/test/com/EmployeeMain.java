package test.com;

import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeDAO dao = new EmployeeDAOimpl();

		List<EmployeeVO> vos = dao.selectAll();
		for (EmployeeVO x : vos) {
			System.out.println(x);
		}
		System.out.println("=================");

		List<EmployeeJoinDepartmentVO> vos2 = dao.selectAllEmployeeJoinDepartment();
		for (EmployeeJoinDepartmentVO x : vos2) {
			System.out.println(x);
		}

		List<EmployeeJoinJobsVO> vos3 = dao.selectAllEmployeeJoinJobs();
		for (EmployeeJoinJobsVO x : vos3) {
			System.out.println(x);
		}
		List<EmployeeJoinDepartmentJoinJobsVO> vos4 = dao.selectAllEmployeeJoinDepartmentJoinJobs();
		for (EmployeeJoinDepartmentJoinJobsVO x : vos4) {
			System.out.println(x);
		}

	}// end main

}// end class
