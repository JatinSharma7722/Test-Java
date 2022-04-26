package testJavaExample;

import java.util.List;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Map;

public class EmployeeImp1 {
	TreeSet<Collection_1> uniqueEmployeeList;
	float average;
	Map<Long, String> employeeSalaryStatus = new TreeMap<>();

	EmployeeImp1(List<Collection_1> employeeList) {
		this.uniqueEmployeeList = new TreeSet<Collection_1>(employeeList);
	}

	public void printUniqueEmployee(List<Collection_1> employeeList) {
		this.uniqueEmployeeList = new TreeSet<Collection_1>(employeeList);
		for (Collection_1 e : uniqueEmployeeList) {
			System.out.println(e);
		}
	}

	public void averageSalary() {
		int sum = 0;
		for (Collection_1 e : uniqueEmployeeList) {
			sum = sum + e.getEmployeeSalary();
		}
		average = (float) (sum / uniqueEmployeeList.size());
		System.out.println(average);
	}
	public void salaryStatus() {
		String salaryStatus = null;
		for (Collection_1 e :uniqueEmployeeList) {
			if(e.getEmployeeSalary()>average)
			{
				salaryStatus="Above Average";
				employeeSalaryStatus.put(e.getEmployeeId(), salaryStatus);
			}
			else if(e.getEmployeeSalary()<average)
			{
				salaryStatus="Below Average";
				employeeSalaryStatus.put(e.getEmployeeId(), salaryStatus);
			}
			else
			{
				salaryStatus="Equal to  Average";
				employeeSalaryStatus.put(e.getEmployeeId(), salaryStatus);
			}
			}
		System.out.println(employeeSalaryStatus);
	}
}
