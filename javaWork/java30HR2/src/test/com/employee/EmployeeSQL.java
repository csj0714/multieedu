package test.com.employee;

public interface EmployeeSQL {
	String SELECT_ALL_EMPLOYEE = "select * from employees order by employee_id";
	String SELECT_ALL_EMPLOYEE_JOIN_DEPARTMENT = "select employee_id,first_name,last_name,email,"
			+ "phone_number,hire_date,job_id,salary," + "commission_pct,e.manager_id,"
			+ "e.department_id,department_name " + "from employees e join departments d "
			+ "on e.department_id = d.department_id " + "order by employee_id";
	String SEKECT_ALL_EMPLOYEE_JOIN_JOBS = "select employee_id,first_name,last_name,email,phone_number,"
			+ "hire_date,e.job_id,salary,commission_pct,e.manager_id," + "e.department_id,job_title "
			+ "from employees e join jobs j " + "on e.job_id = j.job_id " + "order by employee_id";
	String SELECT_ALL_EMPLOYEE_JOIN_DEPARTMENT_JOIN_JOBS = "select employee_id,first_name,last_name,email,phone_number,"
			+ "hire_date,e.job_id,salary,commission_pct,e.manager_id," + "e.department_id,department_name ,job_title "
			+ "from employees e join departments d " + "on e.department_id = d.department_id " + "join jobs j "
			+ "on e.job_id = j.job_id " + "order by employee_id";
}
