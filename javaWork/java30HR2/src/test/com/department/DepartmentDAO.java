package test.com.department;

import java.util.List;

public interface DepartmentDAO {

	public List<DepartmentVO> selectAll();

	public List<DepartmentJoinLocationVO> selectAllDepartmentJoinLocation();

}
