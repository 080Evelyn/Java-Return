package oop;

public class WorkerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Tim = new Employee("Tim", "11/11/1985","01/01/2020");
		
		System.out.println(Tim);
		System.out.println("Age = " + Tim.getAge());
		System.out.println("Pay " + Tim.collectPay());

		SalariedEmployee Joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
		System.out.println(Joe);
		System.out.println("Joe's paycheck = $" + Joe.collectPay());
		
		Joe.retire();
		System.out.println("Joe's Pension check = $" + Joe.collectPay());
		
		HourlyEmployee Mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
		System.out.println(Mary);
		System.out.println("Mary's paycheck = $ " + Mary.collectPay());
		System.out.println("Mary's Holiday Pay = $ " + Mary.getDoubleay());
	}

}