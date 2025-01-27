package oop;

public class Employee extends Worker{

	private long employeid;
	private String hireDate;
	
	private static int employeeNo = 1;
	
	public Employee(String name, String birthDate, String hireDate) {
		super(name, birthDate);
		this.employeid = Employee.employeeNo++;
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [employeid=" + employeid + ", hireDate=" + hireDate + "]" + super.toString();
	}
	
}
