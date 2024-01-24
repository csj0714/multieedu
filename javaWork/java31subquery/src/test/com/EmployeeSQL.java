package test.com;

public interface EmployeeSQL {

	String SELECT_ALL = "select * from employees order by employee_id";

	String SELECT_ALL_PAGE_BLOCK = "select rnum,employee_id,first_name , " + "last_name,email, "
			+ "phone_number,hire_date,job_id,salary, " + "commission_pct,manager_id,department_id "
			+ "from (select rownum rnum,employee_id,first_name, " + "last_name,email, "
			+ "phone_number,hire_date,job_id,salary, " + "commission_pct,manager_id,department_id " + "from employees "
			+ "order by employee_id desc) " + "where rnum between ? and ?";

	String SELECT_ALL_EMP_DEPT = "select employee_id,first_name,last_name,email,"
			+ "phone_number,hire_date,job_id,salary," + "commission_pct,e.manager_id,"
			+ "e.department_id,department_name " + "from employees e join departments d "
			+ "on e.department_id = d.department_id " + "order by employee_id";

	String SELECT_ALL_EMP_JOB = "select employee_id,first_name,last_name,email,phone_number,"
			+ "hire_date,e.job_id,salary,commission_pct,e.manager_id," + "e.department_id,job_title "
			+ "from employees e join jobs j " + "on e.job_id = j.job_id " + "order by employee_id";

	String SELECT_ALL_EMP_DEPT_JOB = "select employee_id,first_name,last_name,email,phone_number,"
			+ "hire_date,e.job_id,salary,commission_pct,e.manager_id," + "e.department_id,department_name ,job_title "
			+ "from employees e join departments d " + "on e.department_id = d.department_id " + "join jobs j "
			+ "on e.job_id = j.job_id " + "order by employee_id";

	String INSERT = "insert into employees(" + "employee_id,first_name,last_name,email,phone_number,"
			+ "hire_date,job_id,salary,commission_pct,manager_id,department_id) "
			+ "values(employees_seq.nextval,?,?,?,?,?,?,?,?,?,?)";

	String UPDATE = "update employees set " + "salary=(select salary from employees "
			+ "where first_name=? and last_name=?) " + "where first_name=? and last_name=?";

	String DELETE = "delete from employees where employee_id=?";

	String SELECT_ONE = "select * from employees where employee_id=?";

	String SEARCHLIST_NAME = "select * from employees where first_name||' '||last_name like ?";
	String SEARCHLIST_JOB_ID = "select * from employees where job_id like ?";
	String SEARCHLIST_TEL = "select * from employees where phone_number like ?";

}
