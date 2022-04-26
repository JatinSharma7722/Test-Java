package testJavaExample;

import java.io.Serializable;

public class Generics implements Serializable {

	private static final long serialVersionUID = 1L;
	Long employeeId;
	String employeeName;
	Integer employeeSalary;
	String employeeDepartmentName;

	protected Generics() {

	}

	protected Generics(Long employeeId, String employeeName, Integer employeeSalary, String employeeDepartmentName) {
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
		return "Generics [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeDepartmentName=" + employeeDepartmentName + "]";
	}

}
