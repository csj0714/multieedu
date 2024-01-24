package test.com;

import java.io.Serializable;
import java.util.Objects;

public class EmpDetailsViewVO implements Serializable {

	private int employee_id;
	private String job_id;
	private int manager_id;
	private int department_id;
	private int location_id;
	private String country_id;
	private String first_name;
	private String last_name;
	private int salary;
	private double commission_pct;
	private String department_name;
	private String job_title;
	private String city;
	private String state_province;
	private String country_name;
	private String region_name;

	public EmpDetailsViewVO() {
		// TODO Auto-generated constructor stub
	}

	public EmpDetailsViewVO(int employee_id, String job_id, int manager_id, int department_id, int location_id,
			String country_id, String first_name, String last_name, int salary, double commission_pct,
			String department_name, String job_title, String city, String state_province, String country_name,
			String region_name) {
		super();
		this.employee_id = employee_id;
		this.job_id = job_id;
		this.manager_id = manager_id;
		this.department_id = department_id;
		this.location_id = location_id;
		this.country_id = country_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.department_name = department_name;
		this.job_title = job_title;
		this.city = city;
		this.state_province = state_province;
		this.country_name = country_name;
		this.region_name = region_name;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getCommission_pct() {
		return commission_pct;
	}

	public void setCommission_pct(double commission_pct) {
		this.commission_pct = commission_pct;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState_province() {
		return state_province;
	}

	public void setState_province(String state_province) {
		this.state_province = state_province;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, commission_pct, country_id, country_name, department_id, department_name, employee_id,
				first_name, job_id, job_title, last_name, location_id, manager_id, region_name, salary, state_province);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpDetailsViewVO other = (EmpDetailsViewVO) obj;
		return Objects.equals(city, other.city)
				&& Double.doubleToLongBits(commission_pct) == Double.doubleToLongBits(other.commission_pct)
				&& country_id == other.country_id && Objects.equals(country_name, other.country_name)
				&& department_id == other.department_id && Objects.equals(department_name, other.department_name)
				&& employee_id == other.employee_id && Objects.equals(first_name, other.first_name)
				&& Objects.equals(job_id, other.job_id) && Objects.equals(job_title, other.job_title)
				&& Objects.equals(last_name, other.last_name) && location_id == other.location_id
				&& manager_id == other.manager_id && Objects.equals(region_name, other.region_name)
				&& salary == other.salary && Objects.equals(state_province, other.state_province);
	}

	@Override
	public String toString() {
		return "EmpDetailsViewVO [employee_id=" + employee_id + ", job_id=" + job_id + ", manager_id=" + manager_id
				+ ", department_id=" + department_id + ", location_id=" + location_id + ", country_id=" + country_id
				+ ", first_name=" + first_name + ", last_name=" + last_name + ", salary=" + salary + ", commission_pct="
				+ commission_pct + ", department_name=" + department_name + ", job_title=" + job_title + ", city="
				+ city + ", state_province=" + state_province + ", country_name=" + country_name + ", region_name="
				+ region_name + "]";
	}

}
