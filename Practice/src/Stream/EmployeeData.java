package Stream;

public class EmployeeData {
	private int empId;
	private String employeeName;
	private double employeeSalary;
	private String employeeDepartment;
	
	public EmployeeData(int empId,String employeeName,double employeeSalary,String employeeDepartment) {
		this.empId=empId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
		this.employeeDepartment=employeeDepartment;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	@Override
    public String toString() {
        return "EmployeeData{" +
                "id=" + empId +
                ", name='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", department='" + employeeDepartment + '\'' +
                '}';
	}
 
	
	

}
