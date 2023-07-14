package Bank;

public  class BankAccounts extends BankAccount {
	private String name;
	private int accountNumber;
	private double balance;
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void setAccoundNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	@Override
	public int getAccountNumber() {
		return accountNumber;
	}
	@Override
	public double getBalance() {
		return balance;
	}
	@Override
	public void setBalance(double balance) {
		this.balance=balance;
	}

}
