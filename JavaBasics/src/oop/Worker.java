package oop;

public class Worker {

	protected String name; 
	private String birthDate;
	protected String endDate; 
	
	public Worker() {
		
	}
	
	public Worker(String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	public int getAge() {
		int currentYear = 2024;
		int birthYear = Integer.parseInt(birthDate.substring(6));
		int age = currentYear - birthYear;
		return age;
	}
	
	public double collectPay() {
		double pay = 0;
		return pay;
	}
	
	public void terminate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}
	
	
}
