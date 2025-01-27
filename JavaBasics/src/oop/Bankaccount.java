package oop;

public class Bankaccount {
	private String accnumber;
	private double balance;
	private String customername;
	private String email;
	private String phonenumber;
	
	
	public void deposit(double amount) {
		 balance  += amount;
		 System.out.println("Your balance is N" + balance);
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("You withdraw N" + amount + ", your balance is N" + balance);
		}
		else {
			System.out.println("Your balance is insufficient! You only have N" + balance);
		}
	}
	
	public String getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(String accnumber) {
		this.accnumber = accnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	
}
