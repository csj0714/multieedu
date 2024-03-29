package test.com.department;

import java.io.Serializable;
import java.util.Objects;

public class DepartmentJoinLocationVO implements Serializable {

	private int department_id;
	private String department_name;
	private int manager_id;
	private int location_id;
	private String city;

	public DepartmentJoinLocationVO() {
		// TODO Auto-generated constructor stub
	}

	public DepartmentJoinLocationVO(int department_id, String department_name, int manager_id, int location_id,
			String city) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.manager_id = manager_id;
		this.location_id = location_id;
		this.city = city;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, department_id, department_name, location_id, manager_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartmentJoinLocationVO other = (DepartmentJoinLocationVO) obj;
		return Objects.equals(city, other.city) && department_id == other.department_id
				&& Objects.equals(department_name, other.department_name) && location_id == other.location_id
				&& manager_id == other.manager_id;
	}

	@Override
	public String toString() {
		return "DepartmentJoinLocationVO [department_id=" + department_id + ", department_name=" + department_name
				+ ", manager_id=" + manager_id + ", location_id=" + location_id + ", city=" + city + "]";
	}

}
