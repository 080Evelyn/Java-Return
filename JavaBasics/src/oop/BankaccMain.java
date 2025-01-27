package oop;

public class BankaccMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankaccount bnk = new Bankaccount();
		bnk.deposit(2000);
		bnk.withdraw(2000);
		
		
		Bankaccount Bob = new Bankaccount();
		Bob.deposit(600);
		Bob.withdraw(610);

	}

}
