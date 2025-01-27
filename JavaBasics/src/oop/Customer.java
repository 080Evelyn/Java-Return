package oop;

public class Customer {

	private String name;
	private double creditlimit;
	private String email;

	public Customer() {
		this("Nobody", "nobody@gmail.com");
		System.out.println("Custructor to assign arg");
	}

	public Customer(String name, String email) {
		this(name, 1000.0, email); // this(....) calls the constructor that has that parameter
		System.out.println("Custructor with no args that call another cnstructor");
	}

	public Customer(String name, double creditlimit, String email) {
		this.name = name;
		this.email = email;
		this.creditlimit = creditlimit;
		System.out.println("Custructor with name, email and creditlimit");
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", creditlimit=" + creditlimit + ", email=" + email + "]";
	}

//	public String getName() {
//		return name;
//	}
//
//	public double getCreditlimit() {
//		return creditlimit;
//	}
//
//	public String getEmail() {
//		return email;
//	}

	
}
