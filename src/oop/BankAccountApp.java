package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("123123123",1000);
		acc1.setName("Joe");
		acc1.makeDeposit(500);
		acc1.payBill(200);
		System.out.println("Your Name: " +acc1.getName());
		BankAccount acc2 = new BankAccount("123123123", 12312);
		BankAccount acc3 = new BankAccount("123123123", 12313);
		
		
		

	}

}
class BankAccount {
	//banka hesabinin ozellikleri
	private static int ID = 1000;
	private String accountNumber; // ID +2 NUMBER+FIRST 2 NUMBER OF SSN
	private static final int routingNumber = 213123123;
	private String name;
	private String SSN;
	private double balance;
	
	//Constructers
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		ID++;
		this.SSN = SSN;
		setAccountNumber();
	}
	
	public void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + "" + SSN.substring(0,2);
		System.out.println("Your Account Number: " + accountNumber);
		
	}
	
	public void setName(String name) {
		this.name = name;
		
		
		
	}
	public String getName() {
		
		return name;
		
	}
	public void payBill(double amount) {
		balance = balance - amount;
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
}
