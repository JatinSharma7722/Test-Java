package testJavaExample;

import java.io.Serializable;

public class Collection_1 implements Serializable, Comparable<Collection_1> {

	private static final long serialVersionUID = 1L;
	Long employeeId;
	String employeeName;
	Integer employeeSalary;
	String employeeDepartmentName;

	protected Collection_1() {

	}

	protected Collection_1(Long employeeId, String employeeName, Integer employeeSalary,
			String employeeDepartmentName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeDepartmentName = employeeDepartmentName;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Integer employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeDepartmentName() {
		return employeeDepartmentName;
	}

	public void setEmployeeDepartmentName(String employeeDepartmentName) {
		this.employeeDepartmentName = employeeDepartmentName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeDepartmentName=" + employeeDepartmentName + "]";
	}

	@Override
	public int compareTo(Collection_1 o) {
		if (this.employeeSalary > o.employeeSalary) {
			return 1;
		} else if (this.employeeSalary < o.employeeSalary) {
			return -1;
		} else {
			return 0;
		}
	}
}