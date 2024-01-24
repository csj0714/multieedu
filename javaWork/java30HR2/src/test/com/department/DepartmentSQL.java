package test.com.department;

public interface DepartmentSQL {
	String SELECT_ALL_DEPARTMENT = "select * from departments order by department_id";
	String SELECT_ALL_DEPARTMENT_JOIN_LOCATION = "select department_id,department_name,manager_id,location_id,city from departments join locations using(location_id) order by department_id";
}
